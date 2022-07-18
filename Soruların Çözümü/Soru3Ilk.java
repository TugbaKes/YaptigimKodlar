package Tekrar;

import java.util.Scanner;

public class Soru3Ilk {
    public static double hesaplama (double vize , double fi){
        return (vize + fi)/2;
    }
    public static void islem (){
        Scanner sc =new Scanner(System.in);
        System.out.print("Lütfen vize notunu giriniz=");
        double vize = sc.nextDouble();
        System.out.print("Lütfen final notunu giriniz=");
        double fi = sc.nextDouble();
        if((vize >=0 && vize <=100) && (fi>=0 && fi <= 100)){
            System.out.println("Not ortalamanız=" + hesaplama(vize,fi));
        }else{
            System.out.println("Notlar Negatif olamaz. Lütfen bir daha giriniz");
            islem();
        }
    }
    public static void main(String[] args) {
        islem();

    }

}
