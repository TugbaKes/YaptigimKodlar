<?php require_once('header.php'); ?>

<!-- Yazılar Content Start -->
<section id="yaziList">
    <div class="container">
        <div class="row">
            <div class="col-12">
                <div class="row">
                    <div class="col-1"><span class="lead adminBaslik">Yazılar</span></div>
                    <div class="col-2 my-auto"><a href="yazi-ekle.php" class="btn btn-info">Yazı Ekle</a></div>
                </div>
            </div>
        </div>
        <div class="row">
            <div class="col-12">
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>Foto</th>
                            <th>Başlık</th>
                            <th>Kategori</th>
                            <th>Tarih</th>
                            <th>Durum</th>
                            <th>Düzenle</th>
                            <th>Sil</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php
                        $sorgu_yaziList = $db->prepare('select * from yazilar order by id desc');
                        $sorgu_yaziList->execute();

                        if ($sorgu_yaziList->rowCount()) {
                            foreach ($sorgu_yaziList as $satir_yaziList) {
                        ?>
                                <tr>
                                    <td class="w-25"><img src="<?php echo $satir_yaziList['foto']; ?>" alt="<?php echo $satir_yaziList['altetiketi']; ?>" class="img-fluid"></td>
                                    <td style="vertical-align: middle;"><?php echo $satir_yaziList['baslik']; ?></td>
                                    <td style="vertical-align: middle;"><span style="font-size:10px;"><?php echo $satir_yaziList['kategori']; ?></span></td>
                                    <td style="vertical-align: middle;"><span style="font-size:10px;"><?php echo $satir_yaziList['tarih']; ?></span></td>
                                    <td style="vertical-align: middle;"><span style="font-size: 10px;"><?php echo $satir_yaziList['durum']; ?></span></td>
                                    <td style="vertical-align: middle;"><a href="yazi-duzenle.php?id=<?php echo $satir_yaziList['id']; ?>" class="btn btn-warning">Düzenle</a></td>
                                    <td style="vertical-align: middle;"><a href="yazi-sil.php?id=<?php echo $satir_yaziList['id']; ?>" class="btn btn-danger">Sil</a></td>
                                </tr>
                        <?php
                            }
                        }
                        ?>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</section>
<!-- Yazılar Content End -->

<?php require_once('footer.php'); ?>