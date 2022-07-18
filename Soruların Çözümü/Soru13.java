package Tekrar;

import java.util.Scanner;

public class Soru13 {
    public static double vizeHesapla(double vize){
        return  vize*0.3;
    }
    public static double fHesapla(double f){
        return  f*0.7;
    }
    public static double sonuc(double vizeHesapla,double fHesapla){
        return vizeHesapla+fHesapla;
    }


    public static void sorgu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("vıze notunu gırınız");
        double vize= sc.nextDouble();
        if(vize>=0 && vize<=100){
            System.out.println("Fınal notunu gırınız");
            double f = sc.nextDouble();
            if(f>=0 && f<=100){
                sonuc(vizeHesapla(vize),fHesapla(f));
                if(sonuc(vizeHesapla(vize),fHesapla(f))>=50){
                    System.out.println("tebrıkler gectınız\nNotunuz: "+sonuc(vizeHesapla(vize),fHesapla(f)));
                }else{
                    System.out.println(" kaldınız. Lutfen butunlemeye gırınız\nNotunuz:"+sonuc(vizeHesapla(vize),fHesapla(f)));
                }
            }else{
                System.out.println("Gırdınız 0 ıle 100 arasında olmalıdır");
                sorgu();
            }
        }else{
            System.out.println("vıze notu 0 ıle 100 arasında olmalıdır.");
            sorgu();
        }


    }
    public static void main(String[] args) {
        sorgu();

    }
}
