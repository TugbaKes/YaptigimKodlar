package Tekrar;

import java.util.HashMap;

public class HashMapSozluk {
    public static void main(String[] args) {
        HashMap<String,String> ingilizceSozluk = new HashMap<String,String >();
        ingilizceSozluk.put("Gun","Silah");
        ingilizceSozluk.put("Tomorrow","Yarın");
        ingilizceSozluk.put("Yesterday","Dün");
        ingilizceSozluk.put("Car","Araba");
        ingilizceSozluk.put("Computer","Bilgisayar");
        ingilizceSozluk.put("Pencil","Kalem");
        System.out.println(ingilizceSozluk);

        for (String i:ingilizceSozluk.keySet() ) {
            System.out.println(i);
        }
        for (String i:ingilizceSozluk.values() ) {
            System.out.println(i);
        }
        for (String i : ingilizceSozluk.keySet()) {
            System.out.println("key: " + i + " value: " + ingilizceSozluk.get(i));
        }
    }
}
