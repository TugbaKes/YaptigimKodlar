package Tekrar;

import java.util.Scanner;

public class Soru11 {
    public static void tekrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("lutfen sayı gırınız");
        int sayi = sc.nextInt();
        if(sayi>0){
            System.out.println("Gırdınız sayı pozıtıftır");
        } else if (sayi < 0) {
            System.out.println("Gırdınız sayı negatıftır");
        }else{
            System.out.println("Gırdınız sayı notr dur");
        }
        System.out.println("Tekrar bir işlem yapmak ister misiniz?\nEvet\nHayır");
        String secim = sc.next();
        if (secim.equalsIgnoreCase("Evet")){
            tekrar();
        }else if (secim.equalsIgnoreCase("Hayır")){
            System.out.println("Program sonlandırıldı.");
        }else {
            System.out.println("Lütfen Evet veya Hayır giriniz.");
            tekrar();
        }
    }
    public static void main(String[] args) {
        tekrar();
    }
}
