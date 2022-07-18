package Hafta4.Sorular;

import java.util.Scanner;

public class Soru8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sınıf mevcudunu giriniz:");
        int ogrenciSayisi = sc.nextInt();
        int i = 0;
        double sinifNot = 0;
        while(i<ogrenciSayisi){
            System.out.print("Birinci sınav notunu giriniz:");
            double not1 = sc.nextDouble();
            System.out.print("İkinci sınav notunu giriniz:");
            double not2 = sc.nextDouble();
            System.out.println("------------");
            sinifNot += (not1+not2)/2;
            i++;
        }
        System.out.println("Sınıf not ortalaması:"+sinifNot/ogrenciSayisi);
    }
}
