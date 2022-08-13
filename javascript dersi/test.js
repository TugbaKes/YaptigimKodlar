console.log ("selam çalışıyor musun")

var isim = "Killa Hakan";

console.log(isim);

var kazanc=70000;
var gelirdilimi;

if (kazanc<32000){
	gelirdilimi = kazanc*0.15
}
console.log(gelirdilimi);
if(kazanc<=70000){
	gelirdilimi=(kazanc-32000)*0.20 +32000*0.15
}
console.log(gelirdilimi);

isimler =["Çağrı", "aynur","emre","tuğba"];
console.log(isimler[3]);

var toplam=0;
for ( var  x=0 ; x<=100 ; x++)
{
	toplam=toplam+x ;
}
console.log(toplam);

var toplam=0;
for( var x=0; x<=100 ; x=x++){
  if(x%3==0){
  	toplam=toplam+x;
  }
}
console.log (toplam);