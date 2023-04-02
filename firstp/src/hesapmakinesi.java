import java.util.Scanner;

public class hesapmakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("birinci sayıyı seçiniz: ");
        double sayi1 = scan.nextDouble();
        System.out.print("ikinci sayıyı seçiniz: ");
        double sayi2 = scan.nextDouble();
        System.out.println("1- toplama");
        System.out.println("2- çıkarma");
        System.out.println("3- bölme");
        System.out.println("4- çarpma");
        System.out.print("lütfen yapmak istediğiniz işlemi seçiniz: ");

        double sonuc = 0;
        int secim= scan.nextInt();
        if (secim==1){
            sonuc = sayi1 + sayi2;
        } else if (secim==2) {
            sonuc = sayi1 - sayi2;
        } else if (secim==3) {
            sonuc = sayi1 / sayi2;
        } else if (secim==4) {
            sonuc = sayi1 * sayi2;
        }else {
            System.out.println("geçersiz işlem...");
        }
        System.out.println("sonucunuz: " + sonuc);

    }
}
