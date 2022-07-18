package Tekrar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class soru4Ilk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen ailede kaç kişi olduğunu giriniz=");
        int aile = sc.nextInt();
        int toplam = 0;
        ArrayList<Integer> aileSayisi = new ArrayList<>();
        for (int a = 0; a < aile; a++) {
            System.out.print("Lütfen" + " " + (a + 1) + ".kişinin yaşını giriniz=");
            int yas = sc.nextInt();
            aileSayisi.add(yas);
        }
        for (int i = 0; i < aileSayisi.size(); i++) {
            toplam += aileSayisi.get(i);   /// arraylistin elamanın getle çağırıyosun.
        }
        System.out.println("Aile Yaş ortalamanız=" + toplam/ aileSayisi.size());
    }
}
