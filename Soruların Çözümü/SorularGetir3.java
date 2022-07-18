package Tekrar;

import java.util.ArrayList;

public class SorularGetir3 {
    public static void main(String[] args) {
        int dogruSayisi = 0, yanlisSayisi = 0, bosSayisi = 0, puan = 0, soruSayisi = 10;
        ArrayList<String> tumCevaplar = new ArrayList<String>();

        tumCevaplar.add("b");
        tumCevaplar.add("B");
        tumCevaplar.add("c");
        tumCevaplar.add("D");
        tumCevaplar.add("a");
        tumCevaplar.add("D");
        tumCevaplar.add("b");
        tumCevaplar.add("E");
        tumCevaplar.add("d");
        tumCevaplar.add("E");
        tumCevaplar.add("c");
        tumCevaplar.add("E");
        tumCevaplar.add("a");
        tumCevaplar.add("E");
        tumCevaplar.add("c");
        tumCevaplar.add("E");
        tumCevaplar.add("b");
        tumCevaplar.add("E");
        tumCevaplar.add("d");
        tumCevaplar.add("E");
        for (String yanit:tumCevaplar) {
            if (tumCevaplar.indexOf(yanit)%2==0){
                tumCevaplar.set(tumCevaplar.indexOf(yanit),tumCevaplar.get(tumCevaplar.indexOf(yanit))+(tumCevaplar.indexOf(yanit)));
            }else {
                tumCevaplar.set(tumCevaplar.indexOf(yanit),tumCevaplar.get(tumCevaplar.indexOf(yanit))+(tumCevaplar.indexOf(yanit)-1));
            }
        }
        System.out.println(tumCevaplar);
        for (String yanit:tumCevaplar) {
            if (tumCevaplar.indexOf(yanit)%2==1){
                if (yanit.equalsIgnoreCase("e")){
                    bosSayisi+=1;
                }else {
                    continue;
                }

            }else{
                if (tumCevaplar.indexOf(yanit)%2==0){
                    if (yanit.equalsIgnoreCase(tumCevaplar.get(tumCevaplar.indexOf(yanit)+1))){
                        dogruSayisi+=1;
                    }else {
                        yanlisSayisi+=1;
                    }
                }
            }
        }
        System.out.println(dogruSayisi);
        System.out.println(yanlisSayisi);
        System.out.println(bosSayisi);
    }
}
