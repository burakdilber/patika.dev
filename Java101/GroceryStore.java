import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double armutK, elmaK, domatesK, muzK, patlicanK, toplam;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armutK = inp.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elmaK = inp.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domatesK = inp.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muzK = inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        patlicanK = inp.nextDouble();

        toplam = (armut * armutK) + (elma * elmaK) + (domates * domatesK) + (muz * muzK) + (patlican * patlicanK);

        System.out.println("Toplam Tutar: " + toplam + " TL");
    }
}
