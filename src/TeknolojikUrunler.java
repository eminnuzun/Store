public abstract class TeknolojikUrunler {

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public TeknolojikUrunler(int id, double fiyat, Marka marka, double indirimOranı, int stokMiktar, String urunAdı, int depolama, double ekran, int ram) {
        this.id = id;
        this.fiyat = fiyat;
        this.marka = marka;

        this.indirimOranı = indirimOranı;
        this.stokMiktar = stokMiktar;
        this.urunAdı = urunAdı;
        this.depolama = depolama;
        this.ekran = ekran;
        this.ram = ram;
    }



    int id;
    double fiyat;
    Marka marka;



    public double getIndirimOranı() {
        return indirimOranı;
    }

    public void setIndirimOranı(double indirimOranı) {
        this.indirimOranı = indirimOranı;
    }

    public int getStokMiktar() {
        return stokMiktar;
    }

    public void setStokMiktar(int stokMiktar) {
        this.stokMiktar = stokMiktar;
    }

    public String getUrunAdı() {
        return urunAdı;
    }

    public void setUrunAdı(String urunAdı) {
        this.urunAdı = urunAdı;
    }

    int birimFiyat;
    double indirimOranı;
    int stokMiktar;
    String urunAdı;


    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public Marka getMarka() {
        return marka;
    }

    public void setMarka(Marka marka) {
        this.marka = marka;
    }

    public int getDepolama() {
        return depolama;
    }

    public void setDepolama(int depolama) {
        this.depolama = depolama;
    }

    public double getEkran() {
        return ekran;
    }

    public void setEkran(double ekran) {
        this.ekran = ekran;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    int depolama;
    double ekran;
    int ram;




}
