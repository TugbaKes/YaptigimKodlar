<?php require_once('header.php'); ?>

<!-- Sayfa Ekle Section Start -->
<section id="sayfaEkle" class="py-3">
    <div class="container">
        <div class="row">
            <div class="col-2"><span class="lead adminBaslik">Sayfa Ekle</span></div>
            <div class="col-2 my-auto"><a href="sayfalar.php" class="btn btn-info">Tüm Sayfalar</a></div>
        </div>
        <form class="form-row" enctype="multipart/form-data" method="POST">
            <div class="col-md-9">
                <div class="form-group">
                    <input type="text" name="baslik" placeholder="Sayfa Başlığını Girin" class="form-control">
                </div>
                <div class="form-group">
                    <textarea name="icerik" placeholder="İçerik Girin" rows="10" class="form-control"></textarea>
                    <script>
                        CKEDITOR.replace('icerik');
                    </script>
                </div>
                <div class="form-group">
                    <textarea name="meta" placeholder="Sayfa açıklamasını girin (Max. 160 Karakter)" rows="2" class="form-control"></textarea>
                </div>
            </div>
            <div class="col-md-3">
                <div class="form-group">
                    <label for="banner"><small>Banner Görseli Ekle</small></label>
                    <input type="file" name="banner" id="banner">
                </div>
                <div class="form-group">
                    <label><small>Kategori Seçin</small></label>
                    <select name="kategori" class="form-control">
                        <option value="">Seçiniz</option>
                        <?php
                        $sorgu_katList = $db->prepare('select * from kategoriler order by kat_adi asc');
                        $sorgu_katList->execute();

                        if ($sorgu_katList->rowCount()) {
                            foreach ($sorgu_katList as $satir_katList) {
                        ?>
                                <option value="<?php echo $satir_katList['kat_adi']; ?>">
                                    <?php echo $satir_katList['kat_adi']; ?>
                                </option>
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

                <?php
                if ($_POST) {
                    $yuklenecekfoto = "../img/" . $_FILES['banner']['name'];
                    if (move_uploaded_file($_FILES['banner']['tmp_name'], $yuklenecekfoto)) {
                        $sorgu_sayfaEkle = $db->prepare('insert into sayfalar(banner,icerik,meta,durum,tarih,kategori,baslik) values(?,?,?,?,?,?,?)');
                        $sorgu_sayfaEkle -> execute(array($yuklenecekfoto,$_POST['icerik'],$_POST['meta'],$_POST['durum'],$_POST['tarih'],$_POST['kategori'],$_POST['baslik']));
                        if($sorgu_sayfaEkle -> rowCount()){
                            echo '<div class="alert alert-success">Kayıt Eklendi</div>';
                        } else {
                            echo '<div class="alert alert-danger">Hata Oluştu</div>';
                        }
                    }
                }
                ?>
            </div>
        </form>
    </div>
</section>
<!-- Sayfa Ekle Section End -->

<?php require_once('footer.php'); ?>