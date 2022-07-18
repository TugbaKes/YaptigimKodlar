package Tekrar;

import java.util.ArrayList;

public class HesapMakinesiDenemesiUc {
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
        ArrayList<String> islemler2 = new ArrayList<>();
        islemler2.add("10");
        islemler2.add("+");
        islemler2.add("20");
        islemler2.add("/");
        islemler2.add("2");
        islemler2.add("*");
        islemler2.add("6");
        islemler2.add("-");
        islemler2.add("10");
        islemler2.add("/");
        islemler2.add("5");


        double sonuc = 10 + 20 / 2 * 6 - 10 / 5;
        System.out.println(sonuc);

        for (int i = 0; i < islemler.size(); i++) {
            if (i % 2 == 0) {
                continue;
            } else {
                if (islemler.get(i).equalsIgnoreCase("/")) {
                    double sayi1 = 0, sayi2 = 0, sonucBolme = 0;
                    sayi1 = Double.parseDouble(islemler.get(islemler.indexOf("/") - 1));
                    sayi2 = Double.parseDouble(islemler.get(islemler.indexOf("/") + 1));
                    sonucBolme = sayi1 / sayi2;
                    String sayiBir = Double.toString(sonucBolme);
                    islemler.remove(islemler.indexOf("/") - 1);
                    islemler.remove(islemler.indexOf("/") + 1);
                    islemler.set(islemler.indexOf("/"), sayiBir);
                    if (islemler.get(i).equalsIgnoreCase("/")) {
                        break;
                    } else if (islemler.get(i).equalsIgnoreCase("*")) {
                        double sayi3 = 0, sayi4 = 0, sonucCarpma = 0;
                        sayi3 = Double.parseDouble(islemler.get(islemler.indexOf("*") - 1));
                        sayi4 = Double.parseDouble(islemler.get(islemler.indexOf("*") + 1));
                        sonucCarpma = sayi3 * sayi4;
                        String sayiIki = Double.toString(sonucCarpma);
                        islemler.remove(islemler.indexOf("*") - 1);
                        islemler.remove(islemler.indexOf("*") + 1);
                        islemler.set(islemler.indexOf("*"), sayiIki);
                        System.out.println(islemler);
                    } else {
                        break;
                    }
                    if (islemler.get(i).equalsIgnoreCase("/") || islemler.get(i).equalsIgnoreCase("*")) {
                        break;
                    } else if (islemler.get(i).equalsIgnoreCase("+")) {
                        double sayi5 = 0, sayi6 = 0, sonucToplama = 0;
                        sayi5 = Double.parseDouble(islemler.get(islemler.indexOf("+") - 1));
                        sayi6 = Double.parseDouble(islemler.get(islemler.indexOf("+") + 1));
                        sonucToplama = sayi5 * sayi6;
                        String sayiIki = Double.toString(sonucToplama);
                        islemler.remove(islemler.indexOf("+") - 1);
                        islemler.remove(islemler.indexOf("+") + 1);
                        islemler.set(islemler.indexOf("*"), sayiIki);
                        System.out.println(sonucToplama);
                        System.out.println(islemler);
                    }
                } else {

                }
            }
        }


    }
}
