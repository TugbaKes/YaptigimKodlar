package Tekrar;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru8 {
    public static double hesaplama(double notBir, double notIki){
        return (notBir+notIki)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(ConsoleColors.PURPLE+"Sınıf mevcudunu giriniz="+ConsoleColors.RESET);
        int mevcut = sc.nextInt();
        int i = 0;
        double toplam = 0.0;
        ArrayList<Double> sinifOrtalamalar = new ArrayList<>();
        while (i<mevcut){
            System.out.println("Lütfen "+(i+1)+". öğrencinin notunu giriniz");
            System.out.print("Birinci dersin notu=");
            double notBir = sc.nextDouble();
            System.out.print("İkinci dersin notu=");
            double notIki = sc.nextDouble();
            System.out.println("-------------------------");
            sinifOrtalamalar.add(hesaplama(notBir,notIki));
            i++;
        }
        System.out.println(sinifOrtalamalar);
        for (double ortalama:sinifOrtalamalar) {
            toplam += ortalama;
        }
        System.out.print("Sınıfın not ortalama sonucu="+toplam/mevcut);
    }
}
