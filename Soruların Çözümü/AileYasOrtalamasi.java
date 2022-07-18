package Tekrar;

import java.util.ArrayList;
import java.util.Scanner;

public class AileYasOrtalamasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Aile kişi sayısını giriniz:");
        int aile = sc.nextInt();
        ArrayList<Integer> aileSAyisi = new ArrayList<>();
        int toplam = 0;
        for (int i = 0; i < aile; i++) {
            System.out.print("Lütfen"+(i+1)+".kişinin yaşını giriniz:");
            int yas = sc.nextInt();
            aileSAyisi.add(yas);
        }
        for (int a = 0; a < aileSAyisi.size() ; a++) {
            toplam += aileSAyisi.get(a);
        }
        System.out.print("Ailenizin yaş ortalaması:"+ toplam/aileSAyisi.size());
    }
}
