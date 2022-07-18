package Tekrar;

import java.util.Scanner;

public class ParcaBasiPrim {

    public static void islem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Maaşınızı giriniz:");
        double maas = sc.nextDouble();
        if (maas >=500 && maas <= 25000){

        }

        System.out.print("Kaç adet ürün ürettiğinizi giriniz:");
        byte urun = sc.nextByte();
        double netTutar = 0;
        if (urun >= 1 && urun <= 10) {
            netTutar = maas + (urun * 5);
        } else if (urun >= 11 && urun <= 25) {
            netTutar = maas + (urun * 11);
        } else if (urun >= 26 && urun <= 40) {
            netTutar = maas + (urun * 17);
        } else if (urun >= 41) {
            netTutar = maas + (urun * 30);
        } else {
            System.out.println("Ürün adedi negatif olamaz.");
            islem();
        }
        System.out.println("Prim dahil alacağınız maaş:" + netTutar);
    }


    public static void main(String[] args) {
        islem();
    }
}
