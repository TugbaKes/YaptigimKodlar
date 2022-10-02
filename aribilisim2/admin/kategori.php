<?php require_once('header.php'); ?>


<!-- Kategori Ekle ve Liste Section Start -->
<section id="kategori" class="py-3">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <h3>Kategori Ekle</h3>
                <form method="post">
                    <div class="form-group">
                        <input type="text" name="kat_adi" placeholder="Kategori Adı Girin" class="form-control" required>
                    </div>
                    <div class="form-group">
                        <small><label>Kategori Türü</label></small>
                        <select name="kat_turu" class="form-control" required>
                            <option value="">Seçiniz</option>
                            <option value="altkategori">Alt Kategori</option>
                            <option value="ustkategori">Üst Kategori</option>
                        </select>
                    </div>
                    <div class="form-group">
                        <textarea name="aciklama" placeholder="Kategori Açıklaması Girin(Maks. 160 Karakter)" rows="5" class="form-control"></textarea>
                    </div>
                    <div class="form-group">
                        <input type="submit" value="Kaydet" class="btn btn-success w-100">
                    </div>
                </form>
                <?php
                if ($_POST) {
                    $kat_adi = $_POST['kat_adi'];
                    $kat_turu = $_POST['kat_turu'];
                    $aciklama = $_POST['aciklama'];

                    $sorgu_kategori = $db->prepare('insert into kategoriler(kat_adi,kat_turu,aciklama) values(?,?,?)');
                    $sorgu_kategori->execute(array($kat_adi, $kat_turu, $aciklama));

                    if ($sorgu_kategori->rowCount()) {
                        echo '<div class="alert alert-success">Kategori Eklendi</div>';
                    } else {
                        echo '<div class="alert alert-danger">Hata Oluştu</div>';
                    }
                }
                ?>
            </div>
            <div class="col-md-8">
                <h3>Kategori Listesi</h3>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Kategori Adı</th>
                            <th>Kategori Türü</th>
                            <th>Açıklama</th>
                            <th>Düzenle</th>
                            <th>Sil</th>
                        </tr>
                    </thead>
                    <tbody>
                        <?php
                        $sorgu_katlist = $db->prepare('select * from kategoriler order by id desc');
                        $sorgu_katlist->execute();

                        if ($sorgu_katlist->rowCount()) {
                            foreach ($sorgu_katlist as $satir_katlist) {
                        ?>
                                <tr>
                                    <td><?php echo $satir_katlist['id']; ?></td>
                                    <td><?php echo $satir_katlist['kat_adi']; ?></td>
                                    <td><?php echo $satir_katlist['kat_turu']; ?></td>
                                    <td><?php echo $satir_katlist['aciklama']; ?></td>
                                    <td>
                                        <a href="kategori-duzenle.php?id=<?php echo $satir_katlist['id']; ?>" class="btn btn-warning">Düzenle</a>
                                    </td>
                                    <td>
                                        <a href="kategori-sil.php?id=<?php echo $satir_katlist['id']; ?>" class="btn btn-danger">Sil</a>
                                    </td>
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
<!-- Kategori Ekle ve Liste Section End -->
