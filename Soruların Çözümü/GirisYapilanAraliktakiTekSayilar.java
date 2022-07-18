package Tekrar;

import java.util.ArrayList;
import java.util.Scanner;

public class GirisYapilanAraliktakiTekSayilar {
    static Scanner sc = new Scanner(System.in);

    public static void aralikSorma(){
        System.out.print("Aralığın ilk değerini giriniz:");
        int aralikIlk = sc.nextInt();
        System.out.print("Aralığın son değerini giriniz:");
        int aralikSon = sc.nextInt();
        if (aralikIlk > aralikSon){
            System.out.println("İlk değer son değerden büyük olamaz.");
            aralikSorma();
        }else{
            ArrayList<Integer> tekSayilar = new ArrayList<>();
            for (int i = aralikIlk; i <= aralikSon ; i++) {
                if (i%2==1){
                    tekSayilar.add(i);
                }else{

                }
            }
            System.out.println(tekSayilar);
        }
    }
    public static void baslikProgram(){
        System.out.println(ConsoleColors.RED_BOLD+"Belirtilen Aralıktaki Tek Sayıları Gösteren Program"+ConsoleColors.RESET);
    }

    public static void main(String[] args) {
        baslikProgram();
        aralikSorma();
    }
}
