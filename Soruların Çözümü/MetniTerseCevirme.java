package Tekrar;

import java.util.Scanner;

public class MetniTerseCevirme {
    public static void main(String[] args) {
        String metin, ters = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Ters çevirmek istediğini metni giriniz:");
        metin = sc.nextLine();
        for (int i = metin.length() -1; i >=0 ; i--) {
            ters += metin.charAt(i);
        }
        System.out.println(ters);
    }


}
