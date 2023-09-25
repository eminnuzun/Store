public class CepTelefonu extends TeknolojikUrunler{

    int kamera;

    public CepTelefonu(int id, double fiyat, Marka marka, double indirimOranı, int stokMiktar, String urunAdı, int depolama, double ekran, int ram,int kamera,double pil,String renk) {
        super(id, fiyat, marka, indirimOranı, stokMiktar, urunAdı, depolama, ekran, ram);
        this.kamera=kamera;
        this.pil=pil;
        this.renk=renk;
    }

    public int getKamera() {
        return kamera;
    }

    public void setKamera(int kamera) {
        this.kamera = kamera;
    }

    public double getPil() {
        return pil;
    }

    public void setPil(double pil) {
        this.pil = pil;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    double pil;
    String renk;




}
