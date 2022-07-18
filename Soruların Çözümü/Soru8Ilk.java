package Tekrar;

import java.util.Scanner;

public class Soru8Ilk {
    public static double ortalama(double sinav, double sinav2) {
        return (sinav + sinav2) / 2;
    }

    public static void islem() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz=");
        int yas = sc.nextInt();
        if (yas >= 18) {
            System.out.println("Direksiyon sınavına ve trafik sınavına girdiniz mi ? Evet/Hayır");
            String cevap = sc.next();
            if (cevap.equalsIgnoreCase("Evet")) {
                System.out.print("Lütfen direksiyon sınavının sonucunu giriniz=");
                double sinav = sc.nextDouble();
                if (sinav >= 0 && sinav <= 100) {
                    System.out.print("Lütfen trafik sınavının sonucunu giriniz=");
                    double sinav2 = sc.nextDouble();
                    if (sinav2 >= 0 && sinav2 <= 100) {
                        ortalama(sinav, sinav2);
                    } else {
                        System.out.println("Girdiğiniz sınav sonucu 1-100 arası olmalı");
                        islem();
                    }
                    if (ortalama(sinav, sinav2) >= 70) {
                        System.out.println("Tebrikler ehliyet almaya hak kazandınız!" + "\n"
                        +"NOTUNUZ=" + ortalama(sinav,sinav2));
                    } else {
                        System.out.println("Ehliyet alabilmek için 70 ve üzeri not almalısınız.");
                    }
                } else {
                    System.out.println("Girdiğiniz sınav sonucu 1-100 arası olmalı");
                    islem();
                }
            }else if (cevap.equalsIgnoreCase("Hayır")) {
                System.out.println("Lütfen öncelikle sınavlara giriniz.");
            } else {
                System.out.println("Sadece evet veya hayır girişi yapınız.");
                islem();
            }
        }else{
            System.out.println("Lütfen 18 yaşını doldurunuz.");
        }
    }
    public static void main(String[] args) {
        islem();
    }
}
