package Tekrar;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Soru3 {
    //3.	Vize Final Örneği (Tek Vize + Tek Final)
    public static double hesaplama(double vize, double f){
        return (vize+f)/2;
    }


    public static void islem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Vize notunu giriniz:");
        double vize = sc.nextDouble();
        System.out.print("Final notunu giriniz:");
        double f = sc.nextDouble();
        if ((vize >=0 && vize <=100) && (f >=0 && f<=100)){
            System.out.println("Not ortalamanız:"+hesaplama(vize,f));
        }else{
            System.out.println("Vize ve Final Notunuz 0-100 aralığında olmalıdır.");
            islem();
        }
    }


    public static void main(String[] args) {
        islem();
    }
}
