package Hafta4.Sorular;

import java.util.ArrayList;

public class Soru6 {
    public static void main(String[] args) {
        int yil=2015;
        int suAnkiYil=2022;
        double toplam=1250;
        ArrayList<Double> yillikKira = new ArrayList<>();

        while(yil<=suAnkiYil){
            //System.out.println(yil + " için ödenmesi gereken tutar=" + toplam);
            yillikKira.add(toplam);
            toplam *= 1.05;
            yil++;
        }
        double toplamOdenen= 0 ;
        for (double kira :yillikKira) {
            System.out.println(kira);
            toplamOdenen+= (kira*12);
        }
        System.out.println("total ödenen tutar="+toplamOdenen);
    }
}
