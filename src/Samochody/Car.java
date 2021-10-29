package Samochody;

public class Car {

    private String model;
    private String marka;
    private int rok;
    private double cena;
    private String kolor;
    private int ilosc;




    public Car(String model, String marka, int rok, double cena, String kolor, int ilosc){
        this.model = model;
        this.marka = marka;
        this.rok = rok;
        this.cena = cena;
        this.kolor = kolor;
        this.ilosc = ilosc;
    }

    public String toString() {
        return "Samochód : " + "model = " + model + ", marka = " + marka + ", rok = " + rok + ", cena = " + cena + ", kolor = " + kolor + ", ilosc = " + ilosc;
    }

    public void delivery(){
        ilosc++;
    }

    public void sell(){
        ilosc--;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getIlosc() {
        return ilosc;
    }

    public void setIlosc(int ilosc) {
        this.ilosc = ilosc;
    }



}
