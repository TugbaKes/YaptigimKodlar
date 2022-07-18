package Tekrar;

public class YildizOlusturmaOnlu {
    public static void main(String[] args) {
        int sayi = 10;
        for (int i = 1; i <=10 ; i++) {
            for (int j = sayi; j >= i ; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
