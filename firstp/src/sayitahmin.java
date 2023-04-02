import java.util.Random;
import java.util.Scanner;

public class sayitahmin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int tahminsayisi = 0;
        int rastgelesayi = rand.nextInt(100)+1;
        boolean oyunbitti = false;
        System.out.println("1 ile 100 arasında bir sayı tuttum. Bakalım kaç tahminde bileceksin...");

        while (!oyunbitti){
            System.out.print("Tahmininizi giriniz: ");
            int tahmin = scan.nextInt();
            tahminsayisi++;
            if (tahmin==rastgelesayi){
                System.out.println("Tebrikler "+ tahminsayisi +" tahminde bildiniz");
                oyunbitti=true;
            } else if (tahmin<rastgelesayi) {
                System.out.println("Daha büyük bir sayı girin");
            } else {
                System.out.println("Daha küçük bir sayı girin");
            }
        }
    }
}
