package Tekrar;

import java.util.Scanner;

public class Sorular {
    public static void islem (){
        Scanner sc = new Scanner(System.in);
        System.out.println("100-1000 arasında sayı gırınız");
        int sayi1 = sc.nextInt();
        if(sayi1>=100 && sayi1<=1000){
            if((sayi1%3==0)&& (sayi1%4==0) ){
                System.out.println("Gırdınız sayı 3'e ve 4'e tam bolunuyor");
            }else if(sayi1%3==0){
                System.out.println("Gırdınız sayı 3e tam bolunuyor");
            }else if(sayi1%4==0){
                System.out.println("Gırdınız sayı 4e tam bolunuyor");
            }else{
                System.out.println("Girdiğiniz 3 veya 4 e tam bölünmez.");
            }
        }else{
            System.out.println("Gırdınız sayı 100-1000 arasında olmalıdır.");
            islem();
        }
    }


    public static void main(String[] args) {
        islem();
    }
}
