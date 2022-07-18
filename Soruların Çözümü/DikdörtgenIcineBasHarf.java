package Tekrar;

import java.util.Scanner;

public class DikdörtgenIcineBasHarf {
    static Scanner sc = new Scanner(System.in);
    public static int genislik =10, uzunluk = 3;

    public static void tabanTavan(){
        for (int i = 1; i <= genislik; i++) {
            System.out.print("* ");
        }//Tavan tamamlandı.
    }

    public static void forSwitch4(){
        for (int j = 1; j <= genislik - 1; j++) { // 8 kere dönecek aradaki boşluğu atacak.
            switch (j) {
                case 1:
                case 4:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+"   "+ConsoleColors.RESET);
                    break;
                case 2:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+"  "+ConsoleColors.RESET);
                    break;
                case 3:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+"  "+ConsoleColors.RESET);
                    break;
                case 6:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+"  "+ConsoleColors.RESET);
                    break;
                case 7:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+"  "+ConsoleColors.RESET);
                    break;
                case 8:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+"  "+ConsoleColors.RESET);
                    break;
                case 9:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+"  "+ConsoleColors.RESET+" ");
                    break;
                default:
                    break;
            }
        }
    }

    public static void forSwitch3(){
        for (int j = 1; j <= genislik - 1; j++) { // 8 kere dönecek aradaki boşluğu atacak.
            switch (j) {
                case 1:
                case 4:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+"  "+ConsoleColors.RESET);
                    break;
                case 2:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+"  "+ConsoleColors.RESET);
                    break;
                case 3:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+"  "+ConsoleColors.RESET);
                    break;
                case 6:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+"  "+ConsoleColors.RESET);
                    break;
                case 7:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+"  "+ConsoleColors.RESET);
                    break;
                case 8:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+"  "+ConsoleColors.RESET);
                    break;
                case 9:
                    System.out.print(ConsoleColors.GREEN_BACKGROUND+" "+ConsoleColors.RESET+" ");
                    break;
                default:
            }
        }
    }


    public static void forSwitch2(){
        for (int j = 1; j <= genislik - 1; j++) { // 8 kere dönecek aradaki boşluğu atacak.
            switch (j) {
                case 1:
                    System.out.print("  ");
                    break;
                case 2:
                    System.out.print("  ");
                    break;
                case 3:
                    System.out.print("  ");
                    break;
                case 4:
                    System.out.print("  ");
                    break;
                case 6:
                    System.out.print("  ");
                    break;
                case 7:
                    System.out.print("  ");
                    break;
                case 8:
                    System.out.print("  ");
                    break;
                case 9:
                    System.out.print("  ");
                    break;
                default:
            }
        }
    }
//08505779999 varan internet
    public static void icKisim(){
        System.out.println("");
        for (int i = 1; i <= uzunluk - 2; i++) {//3 kere dönecek. Taban ve Tavan için olan *lar fazla olmasın diye
            System.out.print("* "); // Döngü başladı 1-* koydu.
            switch (i){
                case 1:
                    forSwitch4();
                    break;
                case 2:
                    forSwitch2();
                    break;
                case 3:
                    forSwitch4();
                    break;
                default:
                    break;
            }
            //1. satırda 1* sonra 8 bosluk koydu. İkinci döngü bitti.
            System.out.println("*");// İkinci döngüden çıkarken 1* koydu. Sağdaki kenar için // Aynı döngü 3 kere tekrar etti
        }//Yandaki 2 kısa kenar tamamlandı.
    }

    public static void programTamami(){
        tabanTavan();
        icKisim();
        tabanTavan();
    }

    public static void programTamami2(){
        programTamami();
    }

    public static void main(String[] args) {
        programTamami2();
    }
}
