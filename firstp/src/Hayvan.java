public class Hayvan {
    private String ad;
    private String tur;
    private int yas;


    public Hayvan(String ad, String tur, int yas){
        this.ad = ad;
        this.tur = tur;
        this.yas= yas;

    }

    public void nedirbu() {
        System.out.println(getAd()+" bir "+getTur()+" ve "+getyas()+" yaşındadır.");
    }

    public String getAd() {
        return ad;
    }

    public int getyas() {
        return yas;
    }

    public String getTur() {
        return tur;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setyas(int yas) {
        this.yas = yas;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }
}
