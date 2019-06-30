package deneme;
//musteri classı musteri bilgileri olan ve gerektiğinde get setlerini kullanacağımız sınıf//
public class Musteri {
    
    private int tc_no, oda_no, yas, tel_no,giris_tarih,cikis_tarih,cocuk;
    private String ad_soyad, cinsiyet;
    //Constructor//
    public Musteri(int tc_no, int oda_no, String ad_soyad, String cinsiyet, int yas, int cocuk, int tel_no,int giris_tarih,int cikis_tarih)
    {
        this.tc_no = tc_no;
        this.oda_no = oda_no;
        this.ad_soyad=ad_soyad;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
        this.cocuk=cocuk;
        this.tel_no = tel_no;
        this.giris_tarih=giris_tarih;
        this.cikis_tarih=cikis_tarih;
    }
    //Getter-Setter Methods//
    public int getTc_no() {
        return tc_no;
    }

    public void setTc_no(int tc_no) {
        this.tc_no = tc_no;
    }

    public int getOda_no() {
        return oda_no;
    }

    public void setOda_no(int oda_no) {
        this.oda_no = oda_no;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public int getTel_no() {
        return tel_no;
    }

    public void setTel_no(int tel_no) {
        this.tel_no = tel_no;
    }

    public int getGiris_tarih() {
        return giris_tarih;
    }

    public void setGiris_tarih(int giris_tarih) {
        this.giris_tarih = giris_tarih;
    }

    public int getCikis_tarih() {
        return cikis_tarih;
    }

    public void setCikis_tarih(int cikis_tarih) {
        this.cikis_tarih = cikis_tarih;
    }

    public int getCocuk() {
        return cocuk;
    }

    public void setCocuk(int cocuk) {
        this.cocuk = cocuk;
    }

    public String getAd_soyad() {
        return ad_soyad;
    }

    public void setAd_soyad(String ad_soyad) {
        this.ad_soyad = ad_soyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
    
    @Override
    public String toString()
    {
        return "" + tc_no;
    }
}
