package Tekrar;

import java.util.Scanner;

public class Soru18 {

    public static void islem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz:");
        int yas = sc.nextInt();
        if (yas >= 18 && yas < 60){
            System.out.println("Lise mezunu musunuz?\nEvet\nHayır");
            String egitim = sc.next();
            if (egitim.equalsIgnoreCase("evet")){
                System.out.println("Zeka seviye sınav sonucunuzu giriniz:");
                int zekaSonuc = sc.nextInt();
                if (zekaSonuc >= 40){
                    System.out.println("Ehliyet almaya hak kazandınız.");
                }else {
                    System.out.println("Ehliyet alabilmeniz için zeka seviyenin 40 veya üzeri olmalıdır.");
                }
            }else if(egitim.equalsIgnoreCase("hayır")){
                System.out.println("Ehliyet alabilmeniz için eğitim durumunuz lise mezunu veya üzeri olmalıdır.");
            }else{
                System.out.println("Lütfen evet veya hayır giriniz.");
                islem();
            }
        }else {
            System.out.println("Ehliyet alabilmek için 18-60 yaş aralığında olmalısınız.");
        }
    }

    public static void main(String[] args) {
        islem();
    }
}
