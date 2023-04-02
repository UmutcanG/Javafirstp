import java.util.Random;
import java.util.Scanner;

public class sayitahminv2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int rastgelesayi = rand.nextInt(100)+1;
        int tahminsayisi = 0;
        boolean oyunbitti = false;
        System.out.println("1 ile 100 arasında bir sayı tuttum bakalım kaç tahminde bileceksin...");
        //System.out.println("İpucu: Sayı " + (rastgelesayi %2==0 ? "çift" : "tek")+" ve " + ((rastgelesayi > 50 )?"50'den büyük" : "50'den küçük") + ".");

        while (!oyunbitti) {
            System.out.print("Tahminizi giriniz: ");
            int tahmin = scan.nextInt();
            tahminsayisi++;
            if (tahmin==rastgelesayi){
                System.out.println("Tebrikler "+ tahminsayisi + " tahminde bildiniz");
                oyunbitti=true;
            } else if (tahmin < rastgelesayi) {
                System.out.println("Daha büyük bir sayı girin");
            }else {
                System.out.println("Daha küçük bir sayı girin");
            }
            if (!oyunbitti && tahminsayisi==10){
                System.out.println("Tahmin hakkınız doldu sayı "+ rastgelesayi+" idi.");
                oyunbitti=true;
            }
        }
    }
}
