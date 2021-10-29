package Samochody;

public class Main{
    public static void main(String[] args) {
        Car samochod1 = new Car("Astra","Opel", 2002, 8000.00, "Niebieski", 2);
        Car samochod2 = new Car("Mondeo","Ford", 2000, 4000.00, "Biały", 5);

        System.out.println(samochod1.toString());
        samochod1.delivery();
        samochod1.delivery();
        samochod1.delivery();
        System.out.println(samochod1.toString());

        samochod1.sell();
        System.out.println(samochod1.getModel() + " " + samochod1.getMarka() + " " + samochod1.getRok() + " " + samochod1.getCena() + " " + samochod1.getKolor() + " " + samochod1.getIlosc());

        samochod1.setRok(2001);
        System.out.println(samochod1.toString());



    }
}
