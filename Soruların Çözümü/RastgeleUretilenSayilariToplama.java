package Tekrar;

import java.util.ArrayList;
import java.util.Random;

public class RastgeleUretilenSayilariToplama {
    public static void main(String[] args) {
        System.out.println(ConsoleColors.PURPLE_BACKGROUND_BRIGHT+"5.\tRastgele üretilen sayıları toplama – while"+ConsoleColors.RESET);
        Random rnd = new Random();
        int toplam = 0;
        int i = 0;
        ArrayList<Integer> rastgeleSayilar = new ArrayList<>();
        while (toplam < 1000) {
            int sayi = rnd.nextInt(100);
            rastgeleSayilar.add(sayi);
            toplam += sayi;
        }
        System.out.println("Rastgele sayıların toplamı: " + toplam);
        for (int sayi : rastgeleSayilar) {
            System.out.println("Rastgele Sayı: " + sayi);
        }
    }
}
