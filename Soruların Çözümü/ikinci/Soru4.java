package Hafta4.Sorular;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class Soru4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int i = 0;
        ArrayList<Integer> sayilar = new ArrayList<>();
        while (i<10){
            int sayi = rnd.nextInt(1000);
            if (sayi>=250 && sayi%2==0){
                sayilar.add(sayi);
                i++;
            }else {
                System.out.println("1");
            }
        }
        for (int sayi:sayilar){
            System.out.println(sayi);

        }
    }
}
