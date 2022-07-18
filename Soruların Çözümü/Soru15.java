package Tekrar;

import java.util.Scanner;

public class Soru15 {
    public static double yuzdeBes(double benzin){
        return benzin-(benzin*0.05);
    }
    public static double yuzdeOn(double benzin){
        return benzin-(benzin*0.10);
    }
    static double yuzdeOnBes(double benzin){
        return benzin-(benzin*0.15);
    }

    public static void islem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen benzin miktarını giriniiz:");
        double benzin =sc.nextDouble();
        System.out.print("Lütfen aracın hızını giriniz:");
        double hiz = sc.nextDouble();
        if (hiz>=0 && hiz<=100){
            System.out.println("Hızınız saatte "+hiz+" Km iken benzin göstergeniz "+yuzdeBes(benzin)+"'dir.");
        }else if((hiz>=101 && hiz<=200)){
            System.out.println("Hızınız saatte "+hiz+" Km iken benzin göstergeniz "+yuzdeOn(benzin)+"'dir.");
        }else if((hiz>=201 && hiz<=300)){
            System.out.println("Hızınız saatte "+hiz+" Km iken benzin göstergeniz "+yuzdeOnBes(benzin)+"'dir.");
        }else if (hiz>=301){
            System.out.println("Şehirler arası hız limiti 301 Km'dir");
            islem();
        }else {
            System.out.println("Hızınız negatif olamaz.");
            islem();
        }
    }

    public static void main(String[] args) {
        islem();
    }
}
