import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r, alfa;
        double pi = 3.14, alan;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin Yarıçapını giriniz : ");
        r = inp.nextInt();
        System.out.print("Dairenin merkez açısını giriniz: ");
        alfa = inp.nextInt();

        alan = (pi * (r * r) * alfa) / 360;

        System.out.println("Dairenin Alanı: " + alan);
    }
}
