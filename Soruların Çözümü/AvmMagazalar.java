package Tekrar;

import java.util.Random;
import java.util.Scanner;

public class AvmMagazalar {
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    static int secim = 0;
    static int secim2 = 0;
    static int secim3 = 0;
    static int secim4 = 0;
    static int secim5 = 0;

    public static void IlkGiris(){
        System.out.println(ConsoleColors.RED_BOLD + "\t\tAvm'ye Hoşgeldiniz." + ConsoleColors.RESET);
        System.out.println("Tercih yapınız.\n1.Mağaza Listesini Gör\n2.Tahmin Oyunu Oyna\n3.Taş Kağıt Makas Oyna\n4.Çıkış Yap.");
        secim = sc.nextInt();
    }

    public static void avmDonme(){
        System.out.println("Avm'ye dönmek ister misiniz?\n1.Evet\n2.Hayır");
        secim2 = sc.nextInt();
        if (secim2 == 1){
            IlkGiris();
        }else if(secim2 == 2){
            System.out.println("İyi günler.");
        }else {
            System.out.println("Lütfen yalnızca 1 veya 2 olarak seçim yapınız.");
            avmDonme();
        }
    }

    public static void main(String[] args) {

        IlkGiris();
        switch (secim) {
            case 1:
                break;

            case 2:
                SayiTahminOyunu.ilkGiris();
                avmDonme();
                break;
            case 3:
                TasKagitMakas.ilkGiris();
                avmDonme();
                break;
            case 4:
                System.out.println("Çıkış yaptınız.İyi günler.");
                break;
            default:
                System.out.println("Lütfen 1 ve 4 arasında bir seçim yapınız.");
                break;
        }
    }

}
