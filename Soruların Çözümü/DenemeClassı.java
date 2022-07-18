package Tekrar;

import java.util.Scanner;

public class DenemeClassı {

    static class Pig  {
        public static void animalSound() {
            System.out.println("The pig says: wee wee");
        }
    }

    static class Dog {
        public static void animalSound() {
            System.out.println("The dog says: bow wow");
            Scanner sc = new Scanner(System.in);
            byte scl = sc.nextByte();
            System.out.println();
        }
    }

    static class Main {
        public static void main(String[] args) {


           Pig.animalSound();
           Dog.animalSound();
        }
    }

}
