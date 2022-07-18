package Tekrar;

import java.util.Scanner;

public class Mevsimler {
    public static void islem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen mevsim adını giriniz:");
        String mevsimAdi = sc.next();
        if (mevsimAdi.equalsIgnoreCase("Kış")){
            System.out.println("1.Aralık\n2.Ocak\n3.Şubat");
        }else if(mevsimAdi.equalsIgnoreCase("İlkbahar")){
            System.out.println("1.Mart\n2.Nisan\n3.Mayıs");
        }else if(mevsimAdi.equalsIgnoreCase("Yaz")){
            System.out.println("1.Haziran\n2.Temmuz\n3.Ağustos");
        }else if(mevsimAdi.equalsIgnoreCase("Sonbahar")){
            System.out.println("1.Eylül\n2.Ekim\n3.Kasım");
        }else{
            System.out.println("Lütfen mevsim adını doğru giriniz.");
            islem();
        }
    }

    public static void main(String[] args) {
        islem();
    }
}
