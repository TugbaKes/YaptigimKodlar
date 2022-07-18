package Hafta4.Sorular;

import Tekrar.ConsoleColors;

import java.util.Scanner;

public class Faktroriyel {
    public static void islem(){
        System.out.println(ConsoleColors.YELLOW+"\t\tFaktoriyel Hesaplama Programı"+ConsoleColors.RESET);
        Scanner sc = new Scanner(System.in);
        int toplam = 1;
        System.out.print("Faktoriyel hesaplama yapmak istediğiniz sayıyı giriniz:");
        int sayi = sc.nextInt();
        for (int i = sayi; i > 0; i--) {
            toplam *= i;
        }
        System.out.println("Faktoriyel hesaplama sonucunuz:"+toplam);
        System.out.println("Tekrar işlem yapmak ister misinizi?\nEvet\nHayır");
        String tekrarSecim = sc.next();
        if (tekrarSecim.equalsIgnoreCase("Evet")){
            islem();
        }else if(tekrarSecim.equalsIgnoreCase("Hayır")){
            System.out.println("Program sonlandırıldı.");
        }else{
            System.out.println("Lütfen Evet veya Hayır giriniz.");
            islem();
        }
    }

    public static void main(String[] args) {
islem();
    }
}
