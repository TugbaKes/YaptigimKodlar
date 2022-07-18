package Tekrar;

import java.util.Scanner;

public class KarsilastirmaDenemesi {
    public static void main(String[] args) {
        String dogruYanit = "a";
        String yanlisYanit = "b";
        String bosYanit = " ";

        Scanner sc = new Scanner(System.in);
        System.out.println("Cevap gir");
        String kullaniciYanit = sc.next();
        System.out.println(dogruYanit);
        System.out.println(yanlisYanit);
        System.out.println(bosYanit);
        System.out.println(kullaniciYanit);
        if (dogruYanit.equalsIgnoreCase(bosYanit)){
            System.out.println("Cevabınız doğru");
        }else{
            System.out.println("Cevap yanlış");
        }
    }
}
