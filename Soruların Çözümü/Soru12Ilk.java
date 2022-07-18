package Tekrar;

import java.util.Scanner;

public class Soru12Ilk {
    public static void  sorgu (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz=");
        int sayi = sc.nextInt();
        if( sayi%2 ==0){
            System.out.println("Gridiğiniz " + sayi+" sayısı çifttir.");
            sorgu();
        }else{
            System.out.println("Gridiğiniz "+ sayi+" sayısı tektir.");
            sorgu();
        }
    }

    public static void main(String[] args) {
        sorgu();
    }
}
