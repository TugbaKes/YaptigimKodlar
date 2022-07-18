package Tekrar;

import java.util.Scanner;

public class Soru17Ilk {
    public static double hesap (double notBir,double notIki){
        return (notBir + notIki)/2 ;
    }
    public static void islem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen 1. notunuzu giriniz=");
        double notBir = sc.nextDouble();
        System.out.print("Lütfen 2. notunuzu giriniz=");
        double notIki = sc.nextDouble();
        if(hesap(notBir,notIki) >=0 && hesap(notBir,notIki)<=24){
            System.out.println("Notunuz="+hesap(notBir,notIki)+"\nNotunuzun numeric karşılığı 0'dır");
        }else if(hesap(notBir,notIki)>=25 && hesap(notBir,notIki)<=44){
            System.out.println("Notunuz="+hesap(notBir,notIki)+"\nNotunuzun numeric karşılığı 1'dir");
        }else if(hesap(notBir,notIki)>=45 && hesap(notBir,notIki)<=54){
            System.out.println("Notunuz="+hesap(notBir,notIki)+"\nNotunuzun numeric karşılığı 2'dir");
        }else if(hesap(notBir,notIki)>=55&& hesap(notBir,notIki)<=69){
            System.out.println("Notunuz="+hesap(notBir,notIki)+"\nNotunuzun numeric karşılığı 3'dir");
        }else if(hesap(notBir,notIki)>=70 && hesap(notBir,notIki)<=84){
            System.out.println("Notunuz="+hesap(notBir,notIki)+"\nNotunuzun numeric karşılığı 4'dir");
        }else if(hesap(notBir,notIki)>=85 && hesap(notBir,notIki)<=100){
            System.out.println("Notunuz="+hesap(notBir,notIki)+"\nNotunuzun numeric karşılığı 5'dir");
        }else{
            System.out.println("Girdiğiniz not 0-100 aralığında olmalıdır.");
            islem();
        }

    }

    public static void main(String[] args) {
        islem();
    }
}
