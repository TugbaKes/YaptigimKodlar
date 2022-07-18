package Hafta4.Sorular;

import java.util.ArrayList;
import java.util.Random;

public class Soru5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int toplam = 0;
        ArrayList<Integer> sayilar=new ArrayList<>();
        while(toplam<=1000){
            int sayi= rnd.nextInt(100);
            toplam+= sayi;
            sayilar.add(sayi);
        }
        System.out.println("Toplam"+toplam);
        for (int sayi:sayilar
             ) {
            System.out.println("Sayı "+ sayi);

        }
    }
}
