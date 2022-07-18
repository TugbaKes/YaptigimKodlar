package Hafta4.Sorular;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("birinci sayıyı giriniz=");
        float sayi1 = sc.nextFloat();
        System.out.print("ikinci sayıyı giriniz=");
        float sayi2 = sc.nextFloat();
        if(sayi1<sayi2){
            System.out.println(sayi2 + "sayısı"+ sayi1 +"sayısından büyüktür");
        }else if (sayi1>sayi2){
            System.out.println(sayi1 + "sayısı" + sayi2 + "sayısından büyüktür");
        }else{
            System.out.println("girdiğiniz sayılar birbirine eşittir.");
        }
    }
}
