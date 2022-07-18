package Tekrar;

import java.util.ArrayList;
import java.util.Scanner;

public class UrunKomisyonOrani {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> komisyonlar = new ArrayList<>();
        double toplamKomisyon = 0;
        for (int i = 0; i <5 ; i++) {
            System.out.print("Ürün fiyatını giriniz:");
            double fiyat = sc.nextDouble();
            if (fiyat <= 50){
                fiyat *= 0.03;
                komisyonlar.add(fiyat);
            }else{
                fiyat *= 0.02;
                komisyonlar.add(fiyat);
            }
        }
        for (double komisyon:komisyonlar) {
            toplamKomisyon+=komisyon;
        }
        System.out.println(komisyonlar);
        System.out.println("Toplam ödeyeceğiniz komisyon="+toplamKomisyon);
    }
}
