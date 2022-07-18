package Tekrar;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Polindrom testi için kelimeyi giriniz.");
        String kelimeDuz = sc.next();
        String kelimeTers = "";
        for (int i = kelimeDuz.length() - 1; i >= 0; i--) {
            kelimeTers += kelimeDuz.charAt(i);
        }
        if (kelimeDuz.equalsIgnoreCase(kelimeTers)){
            System.out.println("Girdiğiniz kelime polindromdur.\n"+"Girilen Kelime="+kelimeDuz+"\nKelimenin Tersi="+kelimeTers);
        }else {
            System.out.println("Girdiğiniz kelime polindrom değildir.\n"+"Girilen Kelime="+kelimeDuz+"\nKelimenin Tersi="+kelimeTers);
        }
    }
}
