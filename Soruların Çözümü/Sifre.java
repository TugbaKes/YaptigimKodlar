package MartSoruUcPDF;

import Tekrar.ConsoleColors;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sifre {
    static Scanner sc = new Scanner(System.in);
    static Random rnd = new Random();
    static int guvenlikSeviye = 0;
    static String sifre = "";
    static int sayi = 0;
    static boolean buyukHarf = false, kucukHarf = false, ozelKarakter = false, sayiIcerme = false, dogumTarihi = false;
    static ArrayList<Character> harfler = new ArrayList<>();
    static ArrayList<Integer> harflerInt = new ArrayList<>();

    public static void guvenlikSeviye1() {
        System.out.println(ConsoleColors.WHITE_BACKGROUND + ConsoleColors.BLACK_BOLD + "Şifre Güvenlik Seviyesi" + ConsoleColors.RESET);
        System.out.println("--------------------");
        System.out.println(ConsoleColors.GREEN_BACKGROUND + "     " + ConsoleColors.RESET);
        System.out.println("--------------------");
    }

    public static void guvenlikSeviye2() {
        System.out.println(ConsoleColors.WHITE_BACKGROUND + ConsoleColors.BLACK_BOLD + "Şifre Güvenlik Seviyesi" + ConsoleColors.RESET);
        System.out.println("--------------------");
        System.out.println(ConsoleColors.GREEN_BACKGROUND + "          " + ConsoleColors.RESET);
        System.out.println("--------------------");
    }

    public static void guvenlikSeviye3() {
        System.out.println(ConsoleColors.WHITE_BACKGROUND + ConsoleColors.BLACK_BOLD + "Şifre Güvenlik Seviyesi" + ConsoleColors.RESET);
        System.out.println("--------------------");
        System.out.println(ConsoleColors.GREEN_BACKGROUND + "               " + ConsoleColors.RESET);
        System.out.println("--------------------");
    }

    public static void guvenlikSeviye4() {
        System.out.println(ConsoleColors.WHITE_BACKGROUND + ConsoleColors.BLACK_BOLD + "Şifre Güvenlik Seviyesi" + ConsoleColors.RESET);
        System.out.println("--------------------");
        System.out.println(ConsoleColors.GREEN_BACKGROUND + "                    " + ConsoleColors.RESET);
        System.out.println("--------------------");
    }

    public static void dogumTarihiMetod() {

        for (int i = 1940; i <= 2030; i++) {
            if (sifre.contains("" + i)) {
                dogumTarihi = true;
                break;
            } else {
                dogumTarihi = false;
            }
        }
    }

    public static void programTamami() {
        if (dogumTarihi == true) {
            System.out.println("Şifreniz doğum tarihi içeriyor.Lütfen şifrenizi değiştiriniz.");
        } else {
            for (int i = 0; i < sifre.length(); i++) {
                harfler.add(sifre.charAt(i));
            }
            for (int i = 0; i < harfler.size(); i++) {
                sayi = (int) (harfler.get(i));
                harflerInt.add(sayi);
            }
            for (int sayi : harflerInt) {
                if (sayi >= 65 && sayi <= 90) {
                    buyukHarf = true;
                } else if (sayi >= 97 && sayi <= 122) {
                    kucukHarf = true;
                } else if (sayi >= 48 && sayi <= 57) {
                    sayiIcerme = true;
                } else if ((sayi >= 33 && sayi <= 47) || (sayi >= 58 && sayi <= 64) || (sayi >= 91 && sayi <= 96) || (sayi >= 123 && sayi < 126)) {
                    ozelKarakter = true;
                } else {
                }
            }
            for (int i = 1; i < 5; i++) {
                if (buyukHarf == true) {
                    guvenlikSeviye++;
                    buyukHarf = false;
                } else if (kucukHarf == true) {
                    guvenlikSeviye++;
                    kucukHarf = false;
                } else if (ozelKarakter == true) {
                    guvenlikSeviye++;
                    ozelKarakter = false;
                } else if (sayiIcerme == true) {
                    guvenlikSeviye++;
                    sayiIcerme = false;
                } else {
                }
            }

            if (guvenlikSeviye == 0) {
                System.out.println("Şifreniz çok kötü");
            } else if (guvenlikSeviye == 1) {
                guvenlikSeviye1();
            } else if (guvenlikSeviye == 2) {
                guvenlikSeviye2();
            } else if (guvenlikSeviye == 3) {
                guvenlikSeviye3();
            } else if (guvenlikSeviye == 4) {
                guvenlikSeviye4();
            }
        }

    }

    public static void program() {
        System.out.print("Şifrenizi giriniz:");
        sifre = sc.nextLine();
        if (sifre.length() < 8) {
            System.out.println("Şifreniz minimum 8 karakterden oluşmalıdır.");
        } else {
            dogumTarihiMetod();
            programTamami();
        }
    }

    public static void main(String[] args) {
        program();
    }
}
