package Tekrar;

import java.util.ArrayList;
import java.util.Scanner;

public class AileYasOrtalamasi2 {
    public static void main(String[] args) {
        Scanner ok = new Scanner(System.in);
        System.out.println("Ailenın kısı sayısını gırınız");
        int kisiSayisi= ok.nextInt();
        int toplam=0;
        ArrayList<Integer> aileSayisi = new ArrayList<>();
        for (int i = 0; i <kisiSayisi ; i++) {
            System.out.println("Lutfen"+(i+1)+". kısının yasını gırınız");
            int yas = ok.nextInt();
            aileSayisi.add(yas);
        }
        for (int a = 0; a <aileSayisi.size() ; a++) {
            toplam+=aileSayisi.get(a);
        }
        System.out.println("Aılenızın yas ortalaması"+toplam/aileSayisi.size());
    }
}
