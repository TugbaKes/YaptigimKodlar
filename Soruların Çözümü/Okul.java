package Tekrar;

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("kaydetmek isteiğiniz öğrenci sayısını giriniz=");
        Nesneler ogrenciler[] = new Nesneler[sc.nextInt()];
        for (int i = 0; i < ogrenciler.length ; i++) {
            ogrenciler[i] = new Nesneler();
            System.out.print("Lütfen öğrencinin adını giriniz=");
            ogrenciler[i].setOgrenci(sc.nextLine());
            System.out.print("Lütfen öğrencinin numarasını giriniz=");
            ogrenciler[i].setOgrenciNo(sc.nextInt());
            System.out.print("Lütfen öğrencinin üniversitesini giriniz=");
            ogrenciler[i].setUniversite(sc.nextLine());
            System.out.print("Lütfen öğrencinin kampüsünü giriniz=");
            ogrenciler[i].setKampus(sc.nextLine());
            System.out.print("Lütfen öğrencinin bölümünü giriniz=");
            ogrenciler[i].setBolum(sc.nextLine());
            System.out.print("Lütfen öğrencinin dersini  giriniz=");
            ogrenciler[i].setDers(sc.nextLine());
        }
        for (Nesneler n : ogrenciler) {
            System.out.println("Ogrencinin adı=" + n.getOgrenci());
            System.out.println("Ogrencinin numarası=" + n.getOgrenciNo());
            System.out.println("Ogrencinin üniversite=" + n.getUniversite());
            System.out.println("Ogrencinin kampüsü=" + n.getKampus());
            System.out.println("Ogrencinin ders=" + n.getDers());
            System.out.println("Ogrencinin bölüm=" + n.getBolum());
        }

    }
}
