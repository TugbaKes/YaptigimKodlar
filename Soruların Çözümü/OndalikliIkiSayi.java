package Tekrar;

import java.util.Scanner;

public class OndalikliIkiSayi {
 public static void islem(){
     Scanner sc = new Scanner(System.in);
     System.out.println(ConsoleColors.PURPLE_BACKGROUND_BRIGHT+"Ondalıklı İki Sayıdan Büyüğünü Programı"+ConsoleColors.RESET);
     System.out.print("Birinci ondalıklı sayıyı giriniz:");
     double sayiBir = sc.nextDouble();
     System.out.println("İkinci ondalıklı sayıyı giriniz:");
     double sayiIki = sc.nextDouble();
     if (sayiBir > sayiIki){
         System.out.println("Girdiğiniz "+sayiBir+" sayısı "+sayiIki+" sayısından büyüktür.");
     }else if (sayiIki > sayiBir){
         System.out.println("Girdiğiniz "+sayiIki+" sayısı "+sayiBir+" sayısından büyüktür.");
     }else{
         System.out.println("Aynı sayıları giremezsiniz.");
         islem();
     }
 }

    public static void main(String[] args) {
     islem();
    }
}
