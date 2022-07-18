package Tekrar;

import java.util.Scanner;

public class GirilenSayiyaGoreUcgen2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yıldız Sayısını Giriniz :");
        int sayi = input.nextInt();

        for(int i=1; i<=sayi;i++){ // Döngü girilen sayı kadar dönecek. Örnek 3
            for(int x=1; x<=(sayi-i); x++){ // 3-i olana kadar dönecek.
                System.out.print(" ");
            }
            for(int y=1; y<=(2*i-1); y++){
                System.out.print("*");
            }
            for(int z=1; z<=(sayi-i); z++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
