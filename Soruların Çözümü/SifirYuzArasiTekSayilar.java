package Tekrar;

public class SifirYuzArasiTekSayilar {
    public static void main(String[] args) {
        System.out.println(ConsoleColors.PURPLE_BACKGROUND_BRIGHT+"3.\t0 ile 100 arası tek sayıların toplamı"+ConsoleColors.RESET);
        int toplam = 0;
        for (int i = 0; i <100 ; i++) {
            if (i%2!=0){
                toplam += i;
            }

        }
        System.out.println("0-100 arasındaki tek sayıların toplamı: "+toplam);
    }
}
