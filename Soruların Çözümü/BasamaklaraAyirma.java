package Tekrar;

import java.util.Random;
import java.util.Scanner;

public class BasamaklaraAyirma {
    public static void main(String[] args) {
        int randomSayi=0,birler=0,onlar =0,yuzler =0,toplam=0;
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        randomSayi = rd.nextInt(1000);
        System.out.println("Üretilen random sayı: "+randomSayi);
        birler = randomSayi%10;
        System.out.println("Sayının birler basamağı: "+birler);
        randomSayi = randomSayi /10;
        onlar = randomSayi%10;
        System.out.println("Sayının onlar basamağı: "+onlar);
        yuzler = randomSayi/10;
        System.out.println("Sayının yüzler basamağı: "+yuzler);
        toplam = birler+onlar+yuzler;
        System.out.println("Rastgele sayının basamaklarının toplamı:"+toplam);

    }
}
