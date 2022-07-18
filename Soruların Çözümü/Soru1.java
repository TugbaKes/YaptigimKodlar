package Tekrar;

import java.util.Scanner;

public class Soru1 {
    public static double daireAlan(double yariCap) {
        return (yariCap * yariCap) * Math.PI;
    }

    public static double daireCevre(double yariCap) {
        return yariCap * 2 * Math.PI;
    }

    public static double kareAlan(double kenarUzunluk){
        return kenarUzunluk*kenarUzunluk;
    }

    public static double kareCevre(double kenarUzunluk){
        return kenarUzunluk*4;
    }

    public static double dikdortgenAlan(double uzunKenar, double kisaKenar){
        return uzunKenar*kisaKenar;
    }

    public static double dikdortgenCevre(double uzunKenar, double kisaKenar){
        return (uzunKenar+kisaKenar)*2;
    }

    public static void islem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("" +
                "Hangi işlemi yapmak istiyorsunuz (1-6)" +
                "\n" +
                "1.Kare Alan Hesaplama" +
                "\n" +
                "2.Kare Çevre Hesaplama" +
                "\n" +
                "3.Dikdörtgen Alan Hesaplama" +
                "\n" +
                "4.Dikdörtgen Çevre Hesaplama" +
                "\n" +
                "5.Daire Alan Hesaplama" +
                "\n" +
                "6.Daire Çevre Hesaplama");
        String secim = sc.next();
        if (secim.equalsIgnoreCase("5")){
            System.out.print("Yarıçap Giriniz:");
            double yariCap = sc.nextDouble();
            System.out.println("Dairenin Alanı: "+daireAlan(yariCap));
        }else if((secim.equalsIgnoreCase("6"))){
            System.out.print("Yarıçap Giriniz:");
            double yariCap = sc.nextDouble();
            System.out.println("Dairenin Çevresi: "+daireCevre(yariCap));
        }else if((secim.equalsIgnoreCase("1"))){
            System.out.print("Kenar Uzunluğu Giriniz:");
            double kenarUzunluk = sc.nextDouble();
            System.out.println("Karenin Alanı: "+kareAlan(kenarUzunluk));
        }else if((secim.equalsIgnoreCase("2"))){
            System.out.print("Kenar Uzunluğu Giriniz:");
            double kenarUzunluk = sc.nextDouble();
            System.out.println("Karenin Çevresi: "+kareCevre(kenarUzunluk));
        }else if((secim.equalsIgnoreCase("3"))){
            System.out.print("Kısa Kenar Uzunluğu Giriniz:");
            double kisaKenar = sc.nextDouble();
            System.out.println("Uzun Kenar Uzunluğu Giriniz:");
            double uzunKenar = sc.nextDouble();
            System.out.println("Dikdörtgenin Alanı: "+dikdortgenAlan(kisaKenar,uzunKenar));
        }else if((secim.equalsIgnoreCase("4"))){
            System.out.print("Kısa Kenar Uzunluğu Giriniz:");
            double kisaKenar = sc.nextDouble();
            System.out.println("Uzun Kenar Uzunluğu Giriniz:");
            double uzunKenar = sc.nextDouble();
            System.out.println("Dikdörtgenin Çevresi: "+dikdortgenCevre(kisaKenar,uzunKenar));
        }else{
            System.out.println("Yanlış bir seçim yaptınız");
            islem();
        }
        System.out.println("Tekrar işlem yapmak ister misiniz?(1-2)" +
                "\n" +
                "1.Evet" +
                "\n" +
                "2.Hayır");
        String secim2 = sc.next();
        if (secim2.equalsIgnoreCase("1")){
            islem();
        }else if(secim2.equalsIgnoreCase("2")){
            System.out.println("İşlem tamamlandı.");
        }else{
            System.out.println("Yanlış seçim yaptınız.");
        }
    }
    public static void main(String[] args) {
        islem();
    }
}
