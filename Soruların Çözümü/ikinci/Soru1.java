package Hafta4.Sorular;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Maaşınızı giriniz");
        double maas = sc.nextDouble();
        System.out.println("Kaç adet parça ürettiniz");
        int parcaAdet = sc.nextInt();
        double sonuc = 0;
        if (parcaAdet >=1 && parcaAdet <=10){
           sonuc= maas+(parcaAdet*5);
        }else if (parcaAdet >=11 && parcaAdet <=25){
            sonuc= maas+(parcaAdet*11);
        }else if (parcaAdet >=26 && parcaAdet <=40){
            sonuc= maas+(parcaAdet*17);
        }else if (parcaAdet >=41){
            sonuc= maas+(parcaAdet*30);

        }
        System.out.println("Maaşınız: "+ sonuc+"TL ");

    }

}
