
public class hesap {
    public static void main(String[] args) {
        Musteri musteri1 = new Musteri("dsasad","dsadsasad","fnkljkkljnnjk","445456");
        musteri1.setAd("ssafsa");
        musteri1.siparisVer();
        System.out.println("Ad:"+musteri1.getAd()+"Soyad:"+musteri1.getSoyad());
        System.out.println("-----------------------------------");
        Hayvan hayvan1 = new Hayvan("köpek","memeli",11);
        hayvan1.nedirbu();
        Hayvan hayvan2 = new Hayvan("yılan","sürüngen",4);
        hayvan2.nedirbu();

    }
}