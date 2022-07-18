package Tekrar;

import java.util.ArrayList;

public class HesapMakinesiDenemesiDort {
    public static void main(String[] args) {
        ArrayList<String> islemler = new ArrayList<>();
        islemler.add("10");
        islemler.add("+");
        islemler.add("20");
        islemler.add("/");
        islemler.add("2");
        islemler.add("*");
        islemler.add("6");
        islemler.add("-");
        islemler.add("10");
        islemler.add("/");
        islemler.add("5");

        double sonuc = 10 + 20 / 2 * 6 - 10 / 5;
        System.out.println(sonuc);

        for (int i = 0; i < islemler.size(); i++) {
            if (i % 2 == 1) {
                if (islemler.get(i).equalsIgnoreCase("/")) {
                    double sayi1 = 0, sayi2 = 0, sonucBolme = 0;
                    sayi1 = Double.parseDouble(islemler.get(islemler.indexOf("/") - 1));
                    sayi2 = Double.parseDouble(islemler.get(islemler.indexOf("/") + 1));
                    sonucBolme = sayi1 / sayi2;
                    String sayiBir = Double.toString(sonucBolme);
                    islemler.remove(islemler.indexOf("/") - 1);
                    islemler.remove(islemler.indexOf("/") + 1);
                    islemler.set(islemler.indexOf("/"), sayiBir);
                    System.out.println(islemler);
                } else {
                    System.out.println("Boş");
                }
            } else {

            }
        }


    }
}
