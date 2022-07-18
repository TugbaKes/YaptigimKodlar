package Tekrar;

import java.util.Random;
import java.util.Scanner;

public class TrSimulasyonu {
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    static String secim ="",secim2="",secim3="";
    public static void tercihUc(){
        System.out.println("Öldünüz.\nTekrar Dene\nOyuna söv\nÇıkış yap");
        secim3 = sc.nextLine();
        if (secim3.equalsIgnoreCase("Tekrar Dene")){

        }else if (secim3.equalsIgnoreCase("Oyuna Söv")){
            System.out.println(ConsoleColors.CYAN_BOLD+"Böyle oyunun amk");
        }else if (secim3.equalsIgnoreCase("Çıkış yap")){
            System.out.println("Çıkış Yaptınız.İyi Günler");
        }else {
            System.out.println("Lütfen sadece verilen değerlerde seçim yapınız.");
            tercihUc();
        }
    }
    public static void tercihIki(){
        secim2 = sc.nextLine();
        if (secim2.equalsIgnoreCase("İntihar Et")){
         tercihUc();
        }else if (secim2.equalsIgnoreCase("Şansını Dene")){

        }else {
            System.out.println("Lütfen sadece verilen değerlerde seçim yapınız.");
            tercihIki();
        }
    }
    public static void tercihIlk(){
        System.out.println("Oyuna başlamak için tercih yapınız.\nBaşla\nÇıkış Yap");
        secim = sc.nextLine();
        if (secim.equalsIgnoreCase("Başla")){
            System.out.println("Türkiye'de doğdun\nİntihar Et\nŞansını Dene");
            tercihIki();
        }else if (secim.equalsIgnoreCase("Çıkış Yap")){
            System.out.println("Çıkış Yaptınız. İyi günler");
        }else{
            System.out.println("Lütfen sadece verilen değerlerde seçim yapınız.");
            tercihIlk();
        }
    }
    public static void oyunGiris(){
        System.out.println(ConsoleColors.YELLOW_BOLD+"\t\tTr Simülasyonuna Hoşgeldin"+ConsoleColors.RESET);
        tercihIlk();
    }

    public static void main(String[] args) {
        oyunGiris();
    }
}
