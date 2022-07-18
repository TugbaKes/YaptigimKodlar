package Tekrar;

import java.util.Scanner;

public class Soru14Ilk {
    public static double yuzdeOn(double tutar){
        return tutar-(tutar*0.10);
    }
    public static double yuzdeOnBes(double tutar){
        return tutar-(tutar*0.15);
    }
    public static double yuzdeYirmi(double tutar){
        return tutar-(tutar*0.20);
    }
    public static void islem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen yaptığınız alış veriş tutarını giriniz=");
        double tutar = sc.nextDouble();
        if(tutar >= 0 && tutar <=200 ){
            System.out.println("Alışverişinizin indirimli tutarı="+ yuzdeOn(tutar));
        }else if(tutar>=201 && tutar <= 400){
            System.out.println("Alışverişinizin indirimli tutarı="+ yuzdeOnBes(tutar));
        }else if(tutar >=401 ){
            System.out.println("Alışverişinizin indirimli tutarı="+ yuzdeYirmi(tutar));
        }else{
            System.out.println("Girdiğiniz tutar negatif olamaz");
            islem();
        }
    }

    public static void main(String[] args) {
        islem();
    }


}
