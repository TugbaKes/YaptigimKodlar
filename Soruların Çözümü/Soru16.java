package Tekrar;

import java.util.Scanner;

public class Soru16 {
    public  static double sonucE(double yas){
        return  yas*1000;
    }
    public  static double sonucK(double yas){
        return  yas*1000;
    }


    public static  void islem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Lutfen cınsıyetınızı gırınız");
        String cinsiyet = sc.next();
        if(cinsiyet.equalsIgnoreCase("erkek")){
            System.out.println("Lutfen yasınızı gırınız");
            int yasE = sc.nextInt();
            if (yasE >= 58) {
                System.out.println("lutfen pırım gun sayınızı gırınız");
                int pirimE = sc.nextInt();
                if (pirimE>=7800){
                    System.out.println("Emeklı olabılırsınız\nAlacagınız ıkramıye ="+sonucE(yasE));
                }else if (pirimE>=0 && pirimE <7800){
                    System.out.println("emeklı olabılmek ıcın 7800 gun prımınız olmalıdır");
                }else{
                    System.out.println("pırım sayınız negatıf olamaz");
                    islem();
                }
            }else{
                System.out.println("yasınız 58 altı oldugu ıcın emeklı olamazsınız");
            }
        }else if (cinsiyet.equalsIgnoreCase("kadın")){
            System.out.println("Lutfen yasınızı gırınız");
            int yasK = sc.nextInt();
            if (yasK >= 55) {
                System.out.println("lutfen pırım gun sayınızı gırınız");
                int pirimK = sc.nextInt();
                if (pirimK>=7200){
                    System.out.println("Emeklı olabılırsınız\nAlacagınız ıkramıye ="+sonucK(yasK));
                }else if (pirimK>=0 && pirimK <7200){
                    System.out.println("emeklı olabılmek ıcın 7200 gun prımınız olmalıdır");
                }else{
                    System.out.println("pırım sayınız negatıf olamaz");
                    islem();
                }
            }else{
                System.out.println("yasınız 55 altı oldugu ıcın emeklı olamazsınız");
            }
        }else{
            System.out.println("Lutfen erkek yada kadın olarak gırıs yapınız");
            islem();

        }

    }
    public static void main(String[] args) {
        islem();
    }
}
