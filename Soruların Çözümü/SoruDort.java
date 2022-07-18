package MartSoruUcPDF;

import java.util.ArrayList;
import java.util.Scanner;

public class SoruDort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paragraf="", isim="", paragraf2="";
        int count = 0;

        System.out.print("Bir paragraf giriniz:");
        paragraf = sc.nextLine();
        paragraf2 = paragraf.replaceAll("\\."," ");
        System.out.println(paragraf2);
        System.out.print("Kelimeyi giriniz:");
        isim = sc.next();

        String[] bol = paragraf2.split(" ");
        for (String kelime:bol) {
           if (isim.equalsIgnoreCase(kelime)){
               count+=1;
           }
        }
        System.out.println("Girdiğiniz "+isim+" kelimesi paragraf içerisinde "+count+" kez bulundu.");
    }
}
