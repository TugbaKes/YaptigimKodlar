package Tekrar;

import java.util.Scanner;

public class Soru19 {
    public static void islem() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Urun agırlıgı gırınız");
        double agirlik = sc.nextDouble();
        if (agirlik >= 0 && agirlik <= 5) {
            System.out.println("Kargo ucretınız 10 tl dır");
        } else if (agirlik >= 6 && agirlik <= 20) {
            System.out.println("kargo ucretınız 20 tl dır");
        } else if (agirlik > 21 && agirlik <= 30) {
            System.out.println("kargo ucretınız 30 tldır");
        } else if (agirlik > 30) {
            System.out.println("30 kg ustune kargo servısımız yoktur");
        } else {
            System.out.println("kargo agırlıgı negatıf gırılemez");
            islem();
        }
    }

    public static void main(String[] args) {
        islem();
    }
}
