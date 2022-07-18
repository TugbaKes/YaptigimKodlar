package Hafta4.Sorular;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int toplam=0;
        while (true) {
            System.out.print("Bir sayı giriniz:");
            int sayi = sc.nextInt();
            if (sayi!=0){
                toplam+=sayi;
            }else{
                break;
            }

        }
        System.out.println(toplam);

    }
}
