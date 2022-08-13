<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

    <style type="text/css">
      .resimkutu{
        height:200px;
        overflow-y:hidden;
      }
    </style>

    <title>Hello, world!</title>
  </head>
  <body class="bg-dark">

    <div class="container pt-5">
      <div class="row pt-5">
        <div class="col-8 bg-light mx-auto py-2">
          <h3 class="text-dark text-center py-3">Ürünler</h3>
          <input type="text" name="ara" placeholder="Ürün Ara" class="form-control" id="ara">
        </div>
      </div>
      <div class="row">
        <div class="col-md-8 bg-light mx-auto py-2">
          <div class="accordion" id="accordionExample">
  <div class="accordion-item">
    <h2 class="accordion-header" id="headingOne">
      <button class="accordion-button bg-dark text-white" type="button" data-bs-toggle="collapse" data-bs-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
        Ürün Ekle
      </button>
    </h2>
    <div id="collapseOne" class="accordion-collapse collapse show" aria-labelledby="headingOne" data-bs-parent="#accordionExample">
      <div class="accordion-body">
       <input type="text" name="isim" class="form-control" id="isim" placeholder="Ürün İsmi"><br>
       <input type="text" name="resim" class="form-control"  id="resim" placeholder="Resim Url"><br>
       <input type="text" name="fiyat" class="form-control"  id="fiyat" placeholder="Fiyat"><br>
       <button class="btn btn-success" id="ekle" style="width:100%">Ürünü Ekle</button>
      </div>
    </div>
  </div>
  
  
</div>
        </div>
      </div>
      <div class="row">
        <div class="col-md-8 mx-auto bg-light">
          <div id="sonuc"></div>
          <div id="urunler"></div>
        </div>
      </div>
    </div>


    



    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>


    <script type="text/javascript">
        
        $('#ekle').click(function(){

          var isim=$('input[name=isim]').val();
          var fiyat=$('input[name=fiyat]').val();
          var resim=$('input[name=resim]').val();
          var sonuc="Başarılı";

          $.ajax({
            url:'urunekle.php',
            type:'POST',
            data:{"isim":isim,"resim":resim,"fiyat":fiyat},
            success:function(sonuc){
              $('#sonuc').html(sonuc);
            }
          });



        });      

        $('#ara').keyup(function(){

          var ara=$('input[name=ara]').val();

          $.ajax({
            url:'ara.php',
            type:'POST',
            data:{'ara':ara},
            success:function(urunler){
              $('#urunler').html(urunler);
            }
          })

        });

    </script>

   
  </body>
</html>