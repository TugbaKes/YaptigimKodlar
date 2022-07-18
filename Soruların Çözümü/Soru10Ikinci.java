package Tekrar;

import java.util.ArrayList;
import java.util.Scanner;

public class Soru10Ikinci {
//soru
    //

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ahmet'in maaşını giriniz:");
        double maasA = sc.nextDouble();
        System.out.print("Hasan'ın maaşını giriniz:");
        double maasH = sc.nextDouble();
        System.out.print("Hesap yapmak istediğiniz ay sayısını giriniz=");
        int aySayisi = sc.nextInt();
        double yeniMaasA = 0;
        double yeniMaasH = 0;
        double toplamA = 0;
        double toplamH = 0;

        ArrayList<Double> maaslarA = new ArrayList<>();
        ArrayList<Double> maaslarH = new ArrayList<>();
        for (int i = 1; i <=aySayisi ; i++) {
            if (i%2==1){
                System.out.println((i)+". ayın maaşı="+( maasA *=(1.50)));
                maaslarA.add(maasA);
                System.out.println((i)+". ayın maaşı="+( maasH *=(1.25)));
                maaslarH.add(maasH);
                System.out.println("------------------");
            }else{
                System.out.println((i)+". ayın maaşı="+( maasA = (maasA-(maasA*0.25))));
                maaslarA.add(maasA);
                System.out.println((i)+". ayın maaşı="+( maasH *=(1.25)));
                maaslarH.add(maasH);
                System.out.println("------------------");
            }
        }
        for (double maas:maaslarA) {
            toplamA += maas;
        }
        for (double maas:maaslarH) {
            toplamH += maas;
        }
        for (int i = 1; i <=aySayisi ; i++) {
            System.out.println("Ahmet'in "+(i)+". ay maaşı= "+ maaslarA.get(i-1));
            System.out.println("Hasan'ın "+(i)+". ay maaşı= "+ maaslarH.get(i-1));
            System.out.println("\n");
        }



        if (toplamA<toplamH){
            System.out.println("Girilen bilgi sonucu Hasan daha fazla maaş alacaktır.");
            System.out.println("Hasanın toplam maaşı= "+toplamH);
            System.out.println("Ahmetin toplam maaşı= "+toplamA);
        }else if(toplamH<toplamA){
            System.out.println("Girilen bilgi sonucu Ahmet daha fazla maaş alacaktır.");
            System.out.println("Hasanın toplam maaşı= "+toplamH);
            System.out.println("Ahmetin toplam maaşı= "+toplamA);
        }else{
            System.out.println("Ahmet ve Hasanın maaşlarının toplamı eşittir.");
            System.out.println("Hasanın toplam maaşı= "+toplamH);
            System.out.println("Ahmetin toplam maaşı= "+toplamA);
        }
    }
}
