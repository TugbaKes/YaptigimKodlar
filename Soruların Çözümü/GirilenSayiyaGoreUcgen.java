package Tekrar;

import java.util.Scanner;

public class GirilenSayiyaGoreUcgen {
    public static void main(String[] args) {
        int sayi = 5;
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= sayi-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i-1) ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
