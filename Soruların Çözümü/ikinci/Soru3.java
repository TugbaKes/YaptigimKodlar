package Hafta4.Sorular;

public class Soru3 {
    public static void main(String[] args) {
        int sayi=100;
        int toplam=0;
        for (int i = 0; i <100 ; i++) {
            if (i%2!=0){
                toplam = toplam+i;
            }
        }
        System.out.println("Tek sayılıların toplamı"+toplam);
    }

}
