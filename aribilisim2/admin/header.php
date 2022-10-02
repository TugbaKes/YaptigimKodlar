<?php 

session_start();
if(!isset($_SESSION['kadi']))
{

    die('giriş yetkiniz yoktur');
}

require_once('baglan.php');



?>








<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Css Files -->
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/style.css">
    <script src="https://cdn.ckeditor.com/4.19.1/standard/ckeditor.js"></script>


    <title>Document</title>
</head>
<body>
    
<!-- Header Section Start -->
<section id="adminMenu">
    <div class="container-fluid">
        <div class="row" style="height:100vh;">
            <div class="col-md-2 bg-dark text-white">
                <ul class="list-group list-group-flush">
                    <li class="list-group-item">Admin Paneli Gir</li>
                    <li class="list-group-item"><a href="dashboard.php">Dashboard</a></li>
                    <li class="list-group-item"><a href="kategori.php">Kategoriler</a></li>
                    <li class="list-group-item"><a href="yazilar.php">Yazilar</a></li>
                    <li class="list-group-item"><a href="sayfalar.php">Sayfalar</a></li>
                    <li class="list-group-item"><a href="logout.php">Güvenli Çıkış</a></li>
                </ul>
            </div>
            <div class="col-md-10 bg-light">