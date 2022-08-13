<?php

$isim=$_POST['isim'];
$resim=$_POST['resim'];
$fiyat=$_POST['fiyat'];

$dbh = new PDO('mysql:host=localhost;dbname=aribilgi', "root", "");

$sql="INSERT INTO urunler(isim,resim,fiyat) VALUES (:isim,:resim,:fiyat)";

$query=$dbh->prepare($sql);

$query->bindParam(':isim',$isim,PDO::PARAM_STR);
$query->bindParam(':fiyat',$fiyat,PDO::PARAM_STR);
$query->bindParam(':resim',$resim,PDO::PARAM_STR);

$query->execute();


?>