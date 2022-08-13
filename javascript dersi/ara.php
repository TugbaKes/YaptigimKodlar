<?php 
$ara=$_POST['ara'];

$dbh = new PDO('mysql:host=localhost;dbname=aribilgi', "root", "");

$sql="SELECT * FROM urunler WHERE isim LIKE CONCAT('%',:ara,'%')";

$query=$dbh->prepare($sql);

$query->bindParam(':ara',$ara,PDO::PARAM_STR);

$query->execute();

$sonuclar=$query->fetchAll(PDO::FETCH_OBJ);





 ?>
<div class="row">
<?php foreach ($sonuclar as $sonuc): ?>

	<div class="col-md-4">
		
		<div class="card" >
			<div class="resimkutu">
		  <img  src="<?php echo $sonuc->resim ?>" class="card-img-top urunresim" alt="...">
		  </div>
		  <div class="card-body">
		    <h5 class="card-title"><?php echo $sonuc->isim ?></h5>
		    <p class="card-text"><h3><?php echo $sonuc->fiyat ?></h3></p>
		    <a href="#" class="btn btn-success" style="width:100%">Hemen Al</a>
		  </div>
		</div>

	</div>
	



<?php endforeach; ?>
</div>
