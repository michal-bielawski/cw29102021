package Prostokat;

import java.util.Scanner;

public class RectangleArea {
    private int bokA;
    private int bokB;
    private int pole;

    public void pobieranieDanych(){
        Scanner in = new Scanner(System.in);
        bokA = in.nextInt();
        bokB = in.nextInt();
    }

    public void obliczaniePola(){
        pobieranieDanych();
        pole = bokA * bokB;
        wyswietlaniePola();
    }

    public void wyswietlaniePola(){
        System.out.println("Pole prostokątu wynosi: " + pole);
    }
}
