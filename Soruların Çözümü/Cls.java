package Tekrar;

import java.util.Scanner;

public class Cls {
    public static String FirstReverse(String str) {
        String rts = "";
        for(int  i= str.length()-1; i >=0; i--){
            rts += str.charAt(i);
        }
        str = rts;
        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstReverse(s.nextLine()));
    }
}