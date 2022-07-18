package Tekrar;

public class Nesneler {
    private String universite;
    private String kampus ;
    private String bolum;
    private String ders;
    private String ogrenci;
    private int ogrenciNo;

    public String getUniversite() {
        return universite;
    }

    public void setUniversite(String universite) {
        this.universite = universite;
    }

    public String getKampus() {
        return kampus;
    }

    public void setKampus(String kampus) {
        this.kampus = kampus;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getDers() {
        return ders;
    }

    public void setDers(String ders) {
        this.ders = ders;
    }

    public String getOgrenci() {
        return ogrenci;
    }

    public void setOgrenci(String ogrenci) {
        this.ogrenci = ogrenci;
    }

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public Nesneler(String universite, String kampus, String bolum, String ders, String ogrenci, int ogrenciNo) {
        this.universite = universite;
        this.kampus = kampus;
        this.bolum = bolum;
        this.ders = ders;
        this.ogrenci = ogrenci;
        this.ogrenciNo = ogrenciNo;
    }

    public Nesneler() {
    }
}

