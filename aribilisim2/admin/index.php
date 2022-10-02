<?php session_start(); ?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Css Files -->
    <link rel="stylesheet" href="../css/bootstrap.min.css">
    <link rel="stylesheet" href="../css/style.css">


    <title>Admin Paneli Giriş</title>
</head>

<body>

    <!-- Login Section Start -->
    <section id="login">
        <div class="container">
            <div class="row" style="height: 80vh;">
                <div class="col-4 mx-auto my-auto text-center">
                    <h2>Arı Bilişim Login</h2>
                    <form method="post">
                        <div class="form-group">
                            <input type="text" name="kadi" class="form-control" placeholder="Kullanıcı Adınız">
                        </div>
                        <div class="form-group">
                            <input type="password" name="sifre" placeholder="Şifreniz" class="form-control">
                        </div>
                        <div class="form-group">
                            <input type="submit" value="Giriş Yap" class="btn btn-success w-100">
                        </div>
                    </form>
                    <?php
                    if ($_POST) {
                        $kullanici = $_POST['kadi'];
                        $pass = $_POST['sifre'];

                        if ($kullanici == 'Admin' && $pass == 123) {
                            $_SESSION['kadi'] = $kullanici;
                            echo '<div class="alert alert-success"><small>Kullanıcı Adı ve Şifre Doğru. Lütfen Bekleyin.</small></div><meta http-equiv="refresh" content="2; url=dashboard.php">';
                        } else {
                            echo '<div class="alert alert-danger"><small>Kullanıcı Adı veya Şifre Yanlış. Lütfen Tekrar Deneyin.</small></div>';
                        }
                    }
                    ?>
                </div>
            </div>
        </div>
    </section>
    <!-- Login Section End -->






    <!-- Js Files (Jquery -> Popper -> Bootstrap Js) -->
    <script src="../js/jquery.slim.min.js"></script>
    <script src="../js/popper.min.js"></script>
    <script src="../js/bootstrap.min.js"></script>
</body>

</html>