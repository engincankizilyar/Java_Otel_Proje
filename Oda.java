package deneme;

public class Oda {
    //oda classı oda bilgileri olan ve gerektiğinde get setlerini kullanacağımız sınıf//
    private int oda_no, kapasite, fiyat;
    private String oda_tip,ozellik;

    public Oda(int oda_no, String oda_tip, String ozellik, int kapasite, int fiyat)
    {
        this.oda_no = oda_no;
        this.oda_tip = oda_tip;
        this.ozellik = ozellik;
        this.kapasite = kapasite;
        this.fiyat = fiyat;
    }
    public Oda(int oda_no)
    {
        this.oda_no = oda_no;
    }
    public int getOda_no()
    {
        return oda_no;
    }
    public String getOda_tip()
    {
        return oda_tip;
    }
    public String getOzellik()
    {
        return ozellik;
    }
    public int getKapasite()
    {
        return kapasite;
    }
    public int getFiyat()
    {
        return fiyat;
    }
    @Override
    public String toString()
    {
        return "" + oda_no;
    }
    public String toOdaTip()
    {
        return "" + oda_tip;
    }
}
