<?php require_once('header.php'); ?>

<!-- Yazı Ekle Start -->
<section id="yaziEkle" class="py-3">
    <div class="container">
        <div class="row">
            <div class="col-2">
                <span class="lead adminBaslik">Yazı Ekle</span>
            </div>
            <div class="col-2 my-auto">
                <a href="yazilar.php" class="btn btn-info">Tüm Yazılar</a>
            </div>
        </div>
        <div class="row">
            <div class="col-12">
                <form action="" class="form-row" enctype="multipart/form-data" method="POST">
                    <div class="col-md-9">
                        <div class="form-group">
                            <input type="text" name="baslik" placeholder="Yazı Başlığı Ekle" class="form-control">
                        
                        </div>
                        <div class="form-group">
                            <textarea name="makale" placeholder="Yazı Girin" rows="10" class="form-control"></textarea>
                            <script>
                        CKEDITOR.replace( 'makale' );
                </script>
                        </div>
                        <div class="form-group">
                            <textarea name="meta" placeholder="Sayfa Açıklaması Girin (Max. 160 Karakter)" rows="3" class="form-control"></textarea>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <div class="form-group">
                            <input type="file" name="gorsel">
                        </div>
                        <div class="form-group">
                            <input type="text" name="altetiketi" placeholder="Görsel Alt Metni Girin" class="form-control">
                        </div>
                        <div class="form-group">
                            <label><small>Kategori Seçin</small></label>
                            <select name="kategori" class="form-control">
                                <option value="">Seçiniz</option>
                                <?php
                                $sorgu_katlist = $db->prepare('select * from kategoriler order by kat_adi asc');
                                $sorgu_katlist->execute();

                                if ($sorgu_katlist->rowCount()) {
                                    foreach ($sorgu_katlist as $satir_katlist) {
                                ?>
                                        <option value="<?php echo $satir_katlist['kat_adi']; ?>"><?php echo $satir_katlist['kat_adi']; ?></option>
                                <?php

                                    }
                                }
                                ?>
                            </select>
                        </div>
                        <div class="form-group">
                            <label><small>Yayın Tarihi</small></label>
                            <input type="date" name="tarih" class="form-control">
                        </div>
                        <div class="form-group">
                            <label><small>Yayın Durumu</small></label>
                            <select name="durum" class="form-control">
                                <option value="">Seçiniz</option>
                                <option value="taslak">Taslak</option>
                                <option value="yayinlandi">Yayınlandı</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <input type="submit" value="Kaydet" class="btn btn-success w-100">
                        </div>
                    </div>
                </form>
                <?php
                if ($_POST) {
                    $baslik = $_POST['baslik'];
                    $makale = $_POST['makale'];
                    $meta = $_POST['meta'];
                    $dizin = "../img/";
                    $yuklenecekfoto = $dizin . $_FILES['gorsel']['name'];
                    $altetiketi = $_POST['altetiketi'];
                    $kategori1 = $_POST['kategori'];
                    $tarih = $_POST['tarih'];
                    $durum = $_POST['durum'];

                    if (move_uploaded_file($_FILES['gorsel']['tmp_name'], $yuklenecekfoto)) {
                        $sorgu_yaziekle = $db->prepare('insert into yazilar(baslik,makale,meta,foto,altetiketi,kategori,tarih,durum) values(?,?,?,?,?,?,?,?)');
                        $sorgu_yaziekle->execute(array($baslik, $makale, $meta, $yuklenecekfoto, $altetiketi, $kategori1, $tarih, $durum));

                        if($sorgu_yaziekle -> rowCount()){
                            echo '<div class="alert alert-success">Kayıt Başarılı</div>';
                        } else {
                            echo '<div class="alert alert-danger">Hata Oluştu</div>';
                        }
                    }
                }
                ?>
            </div>
        </div>
    </div>
</section>
<!-- Yazı Ekle End -->

<?php require_once('footer.php'); ?>