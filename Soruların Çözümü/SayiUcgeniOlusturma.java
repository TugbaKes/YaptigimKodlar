package Tekrar;

import java.util.Scanner;
/*
Konsoldan girilen sayıyı 1 e kadar yazdırıp,aynı satırda tekrardan
verilen sayıya kadar yazdıran ve alt alt 1’er azaltıp aynı işlemi üçgen gibi
devam ettiren java algoritma kodunu yazınız.
 */
public class SayiUcgeniOlusturma {
    static Scanner sc = new Scanner(System.in);
    static int sayi = 0;
    public static void main(String[] args) {
        System.out.print("Sayı üçgeni oluşturmak için bir sayı giriniz:");
        sayi = sc.nextInt();
        for (int i = sayi; i >= 1; i--) {//Girilen sayı kadar yukarıdan aşağı döngü başladı.
            for (int j = i; j >=1 ; j--) {// i değeri 1 olana kadar dönecek
                System.out.print(j+"-");//i değeri 1 olana kadar j değeri yazdırıp bir boşluk bırakacak
            }//Döngü bitti
            for (int k = 2; k <=i; k++) {// Bir önceki 1 de bittiği için bu döngüyü 2den başlatıyoruz. K değeri İ değerine ulaşana kadar dön
                System.out.print(k+" ");// K değeri İ değerine ulaşana kadar K bastır bir boşluk bırak
            }//Döngü bitti
            System.out.println("");//Alt satıra geçti
        }
    }
}
