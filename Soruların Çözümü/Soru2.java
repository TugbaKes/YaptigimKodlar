package Tekrar;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bölünen giriniz:");
        double bolunen = sc.nextDouble();
        System.out.print("Bölen giriniz:");
        double bolen = sc.nextDouble();
        System.out.println("Bölüm:"+(bolunen/bolen));
    }
}
