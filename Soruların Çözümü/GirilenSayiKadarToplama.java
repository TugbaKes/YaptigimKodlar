package Tekrar;

import java.util.Scanner;

public class GirilenSayiKadarToplama {
    public static void islem(){
        Scanner sc = new Scanner(System.in);
        int toplam = 0;
        System.out.println("Toplama yacapınız sayıyı giriniz:");
        int toplamaSayisi = sc.nextInt();
        if (toplamaSayisi >= 2 && toplamaSayisi <=10){
            for (int i = 0; i < toplamaSayisi ; i++) {
                System.out.println((i+1)+". sayıyı giriniz:");
                int sayi = sc.nextInt();
                toplam += sayi;
            }
            System.out.println("Girdiğiniz sayıların toplamı="+toplam);
        }else {
            System.out.println("Toplama işlemi için 2 veya 10 arasında değer girmelisiniz.");
            islem();
        }
    }

    public static void main(String[] args) {
       islem();

    }
}
