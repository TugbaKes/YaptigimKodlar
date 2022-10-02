<?php
require_once('header.php');

$id = $_GET['id']; //köşeli parantezin içi parametrenin gönderdiği arguman'ın id'sidir.
$sorgu_yaziDuzenle = $db->prepare('select * from yazilar where id=?');
$sorgu_yaziDuzenle->execute(array($id));
$satir_yaziDuzenle = $sorgu_yaziDuzenle->fetch();

// Alternatif Yazım
// $id = $_GET['id'];
// $sorgu_yaziDuzenle2 = $db -> prepare("select * from yazilar where id=$id");
// $sorgu_yaziDuzenle2 -> execute();
// $satir_yaziDuzenle = $sorgu_yaziDuzenle -> fetch();
?>

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
                            <input type="text" name="baslik" value="<?php echo $satir_yaziDuzenle['baslik']; ?>" class="form-control">
                        </div>
                        <div class="form-group">
                            <textarea name="makale" rows="10" class="form-control"><?php echo $satir_yaziDuzenle['makale']; ?></textarea>
                            <script>
                                CKEDITOR.replace('makale');
                            </script>
                        </div>
                        <div class="form-group">
                            <textarea name="meta" rows="3" class="form-control"><?php echo $satir_yaziDuzenle['meta']; ?></textarea>
                        </div>
                    </div>
                    <div class="col-md-3">
                        <img src="<?php echo $satir_yaziDuzenle['foto']; ?>" class="img-fluid mb-2">
                        <div class="form-group">
                            <input type="file" name="gorsel">
                        </div>
                        <div class="form-group">
                            <input type="text" name="altetiketi" value="<?php echo $satir_yaziDuzenle['altetiketi']; ?>" class="form-control">
                        </div>
                        <div class="form-group">
                            <label><small>Kategori Seçin - <span style="color:#ff0000; font-weight:600;"><?php echo $satir_yaziDuzenle['kategori']; ?></span> </small></label>
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
                            <input type="date" name="tarih" class="form-control" value="<?php echo $satir_yaziDuzenle['tarih']; ?>">
                        </div>
                        <div class="form-group">
                            <label>
                                <small>
                                    Yayın Durumu -
                                    <span style="color:#ff0000; font-weight:600;">
                                        <?php echo $satir_yaziDuzenle['durum']; ?>
                                    </span>
                                </small>
                            </label>
                            <select name="durum" class="form-control">
                                <option value="">Seçiniz</option>
                                <option value="taslak">Taslak</option>
                                <option value="yayinlandi">Yayınlandı</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <input type="submit" value="Düzenle" class="btn btn-success w-100" name="duzenle">
                        </div>
                    </div>
                </form>
                <?php
                if ($_POST) {
                    $baslik1 = $_POST['baslik'];
                    $makale1 = $_POST['makale'];
                    $meta1 = $_POST['meta'];
                    $dizin = "../img/";
                    $yuklenecekfoto = $dizin . $_FILES['gorsel']['name']; // ../img/blog-189x189.jpg
                    $altetiketi = $_POST['altetiketi'];
                    $kategori = $_POST['kategori'];
                    $tarih = $_POST['tarih'];
                    $durum = $_POST['durum'];

                    if (move_uploaded_file($_FILES['gorsel']['tmp_name'], $yuklenecekfoto)) {
                        $sorgu_duzenle = $db->prepare('update yazilar set baslik=?, makale=?, meta=?, foto=?, altetiketi=?, kategori=?, tarih=?, durum=? where id=?');
                        $sorgu_duzenle->execute(array($baslik1, $makale1, $meta1, $yuklenecekfoto, $altetiketi, $kategori, $tarih, $durum, $id));

                        if ($sorgu_duzenle->rowCount()) {
                            echo '<div class="alert alert-success">Kayıt Güncellenmiştir.</div><meta http-equiv="refresh" content="2; url=yazilar.php">';
                        } else {
                            echo '<div class="alert alert-danger">Hata Oluştu.</div><meta http-equiv="refresh" content="2; url=yazilar.php">';
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