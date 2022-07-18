package Tekrar;

import java.util.ArrayList;

public class HesapMakinesiDenemesiIki {
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

        System.out.println(islemler);
        for (int i = 0; i <islemler.size() ; i++) {
            if (i%2==0){
                continue;
            }else{
                switch (islemler.get(i)){
                    case "/" :
                        double sayi1= 0, sayi2=0, sonucBolme=0;
                        sayi1 = Double.parseDouble(islemler.get(islemler.indexOf("/")-1));
                        sayi2 = Double.parseDouble(islemler.get(islemler.indexOf("/")+1));
                        sonucBolme =  sayi1 /sayi2;
                        String sayiBir = Double.toString(sonucBolme);
                        islemler.remove(islemler.indexOf("/")-1);
                        islemler.remove(islemler.indexOf("/")+1);
                        islemler.set(islemler.indexOf("/"),sayiBir);
                        break;
                    case "*":
                        double sayi3= 0, sayi4=0, sonucCarpma=0;
                        sayi3 = Double.parseDouble(islemler.get(islemler.indexOf("*")-1));
                        System.out.println("Sayi 3 : "+sayi3);
                        sayi4 = Double.parseDouble(islemler.get(islemler.indexOf("*")+1));
                        sonucCarpma =  sayi3 * sayi4;
                        String sayiIki = Double.toString(sonucCarpma);
                        islemler.remove(islemler.indexOf("*")-1);
                        islemler.remove(islemler.indexOf("*")+1);
                        islemler.set(islemler.indexOf("*"),sayiIki);
                        System.out.println(sonucCarpma);
                        System.out.println(islemler);
                            break;
                        }

                }
            }
        System.out.println(islemler);
        }


        double sonuc = 10 + 20 / 2 * 6 - 10;


    }

