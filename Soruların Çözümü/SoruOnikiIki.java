package Tekrar;

import java.util.Scanner;

public class SoruOnikiIki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(ConsoleColors.PURPLE_BACKGROUND_BRIGHT+"\t\tKlavyeden okunan metni tersten yazdırma"+ConsoleColors.RESET);
        System.out.print("Tersten yazdırmak istediğiniz metni giriniz=");
        String metin = sc.next();
        String ters = "";
        for (int i = metin.length() -1; i > 0 ; i--) {
            ters += metin.charAt(i);
        }



        System.out.println(ters);
    }
}


// 0 1 2 3 4
// h a m z a
//

/*
package Tekrar;

import java.util.Scanner;

public class SoruOnikiIki {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ters = "";
        System.out.println(ConsoleColors.PURPLE_BACKGROUND_BRIGHT+"\t\tKlavyeden okunan metni tersten yazdırma"+ConsoleColors.RESET);
        System.out.print("Tersten yazdırmak istediğiniz metni giriniz=");
        String metin = sc.next();
        int uzunluk = metin.length();
        for (int i = uzunluk - 1; i >= 0 ; i--) {
            ters = (ters + metin.charAt(i));
            System.out.print(metin.charAt(i));
        }


    }
}

 */