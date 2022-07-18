package Tekrar;

import java.util.ArrayList;
import java.util.Scanner;

public class YillaraGoreKiraZammi {
    public static void main(String[] args) {
        int yil = 2015;
        int simdiKiYil = 2022;
        double kiraBaslangic = 1250;
       double toplamKira = 0;
        ArrayList<Double> kiralar = new ArrayList<>();
        while (yil<=simdiKiYil){
            kiralar.add(kiraBaslangic);
            kiraBaslangic *= 1.05;
            yil++;
        }
        System.out.println(kiralar);
        for (double kira:kiralar) {
            toplamKira += kira;
        }
        System.out.println(toplamKira);
    }
}
