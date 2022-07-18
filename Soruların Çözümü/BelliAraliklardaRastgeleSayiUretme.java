package Tekrar;

import java.util.ArrayList;
import java.util.Random;

public class BelliAraliklardaRastgeleSayiUretme {
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println(ConsoleColors.PURPLE_BACKGROUND_BRIGHT+"4.\t250 ile 1000 arası while ile rastgele 10 tane çift sayı üretme"+ConsoleColors.RESET);
        int i = 0;
        ArrayList<Integer> sayilar = new ArrayList<>();
        while (i<10){
            int sayi = rnd.nextInt(1000);
            if (sayi>=250 && sayi%2==0){
                sayilar.add(sayi);
                i++;
            }

        }
        for (int sayi:sayilar) {
            System.out.println(sayi);
        }
    }
}
