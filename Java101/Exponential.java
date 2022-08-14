import java.util.Scanner;

public class Main {
    static int result = 1;
    static int usAlma(int taban, int us) {

        if (us == 0) {
            return 1;
        }

        result *= taban;
        usAlma(taban, us - 1);

        return result;
    }

    public static void main(String[] args) {
        int taban, us;

        Scanner inp = new Scanner(System.in);

        System.out.print("Taban Değerini Giriniz: ");
        taban = inp.nextInt();

        System.out.print("Üs Değerini Giriniz: ");
        us = inp.nextInt();

        System.out.println(usAlma(taban, us));
    }
}
