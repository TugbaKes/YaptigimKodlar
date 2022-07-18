package MartSoruUcPDF;

import java.util.*;
//Güçlü şifre oluşturan metot üretiniz. (Oluşan şifrenin karakterleri tekrar kullanılmamalı,
//ardaşık sayı içermemeli(1-2 gibi), en az birer adet büyük, küçük harf ile, ikişer adet numeric
//ve özel karakter(+ * -) gibi içermelidir. En az 8, en çok 10 karakterli bir şifre oluşturabilsin.
public class SifreOlusturucu {
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);
    static String kucukHarflerStringi = "qwertyuıopğüasdfghjklşizxcvbnmöç",
            buyukHarflerStringi = "QWERTYUIOPĞÜASDFGHJKLŞİZXCVBNMÖÇ",
            sayilarStringi = "0123456789",
            sembollerStringi = "\"\'!^+%&/()=?_,.;:<>#\\|",
            sifre = "";
    static int yanitBasla = 0;
    static ArrayList<String> kucukHarfler = new ArrayList<>();
    static ArrayList<String> buyukHarfler = new ArrayList<>();
    static ArrayList<String> sayilar = new ArrayList<>();
    static ArrayList<String> semboller = new ArrayList<>();
    static ArrayList<String> sifreList = new ArrayList<>();

    public static void forKucuk() {
        for (int i = 0; i < kucukHarflerStringi.length(); i++) {
            String harf = String.valueOf(kucukHarflerStringi.charAt(i));
            kucukHarfler.add(harf);
        }
    }

    public static void forBuyuk() {
        for (int i = 0; i < buyukHarflerStringi.length(); i++) {
            String harf = String.valueOf(buyukHarflerStringi.charAt(i));
            buyukHarfler.add(harf);
        }
    }

    public static void forSayi() {
        for (int i = 0; i < sayilarStringi.length(); i++) {
            String harf = String.valueOf(sayilarStringi.charAt(i));
            sayilar.add(harf);
        }
    }

    public static void forSembol() {
        for (int i = 0; i < sembollerStringi.length(); i++) {
            String harf = String.valueOf(sembollerStringi.charAt(i));
            semboller.add(harf);
        }
    }


    public static void main(String[] args) {
        forKucuk();
        forBuyuk();
        forSayi();
        forSembol();

        System.out.println("Şifre oluşturmak için yanıt veriniz. \n 1.Oluştur\n 2.Vazgeç.");
        yanitBasla = sc.nextInt();
        if (yanitBasla == 1) {
            for (int i = 0; i <= 10; i++) {
                int random = 0;
                switch (i) {
                    case 0:
                        random = rnd.nextInt(32);
                        sifreList.add(kucukHarfler.get(random));
                        kucukHarfler.remove(random);
                        break;
                    case 1:
                        random = rnd.nextInt(31);
                        sifreList.add(kucukHarfler.get(random));
                        kucukHarfler.remove(random);
                        break;
                    case 2:
                        random = rnd.nextInt(30);
                        sifreList.add(kucukHarfler.get(random));
                        break;
                    case 3:
                        random = rnd.nextInt(32);
                        sifreList.add(buyukHarfler.get(random));
                        buyukHarfler.remove(random);
                        break;
                    case 4:
                        random = rnd.nextInt(31);
                        sifreList.add(buyukHarfler.get(random));
                        buyukHarfler.remove(random);
                        break;
                    case 5:
                        random = rnd.nextInt(30);
                        sifreList.add(buyukHarfler.get(random));
                        break;
                    case 6:
                        random = rnd.nextInt(9);
                        sifreList.add(sayilar.get(random));
                        sayilar.remove(random);
                        sayilar.remove(random+1);
                        sayilar.remove(random-1);
                        break;
                    case 7:
                        random = rnd.nextInt(7);
                        sifreList.add(sayilar.get(random));
                        break;
                    case 8:
                        random = rnd.nextInt(22);
                        sifreList.add(semboller.get(random));
                        semboller.remove(random);
                        break;
                    case 9:
                        random = rnd.nextInt(21);
                        sifreList.add(semboller.get(random));
                        break;
                    default:
                        break;
                }
            }
            Collections.shuffle(sifreList);
            for (String harf:sifreList) {
                sifre+=harf;
            }
            System.out.print("Şifreniz:"+sifre);
        } else {
            System.out.println("Program sonlandırıldı.");
        }
    }
}
