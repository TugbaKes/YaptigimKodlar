<?php
require_once('header.php'); 

$id = $_GET['id'];
$sorgu_katsil = $db -> prepare('delete from kategoriler where id=?');
$sorgu_katsil -> execute(array($id));

if($sorgu_katsil -> rowCount()){
    echo '<div class="alert alert-success">Kayıt Silinmiştir</div><meta http-equiv="refresh" content="2; url=kategori.php">';
} else {
    echo '<div class="alert alert-danger">Hata Oluştu</div><meta http-equiv="refresh" content="2; url=kategori.php">';
}

require_once('footer.php'); 
?>
