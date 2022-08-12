import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, nFaktoriyel, rFaktoriyel, nrFaktoriyel;

        Scanner input = new Scanner(System.in);

        System.out.print("n değerini Giriniz : ");
        n = input.nextInt();

        System.out.print("r değerini Giriniz : ");
        r = input.nextInt();

        nFaktoriyel = 1;
        rFaktoriyel = 1;
        nrFaktoriyel = 1;

        for(int i = 1; i <= n; i++) {
            nFaktoriyel = nFaktoriyel * i;
        }
        for(int i = 1; i <= r; i++) {
            rFaktoriyel = rFaktoriyel * i;
        }
        for(int i = 1; i <= (n-r); i++) {
            nrFaktoriyel = nrFaktoriyel * i;
        }

        System.out.println("Kombinasyon Sonucu: " + (nFaktoriyel/(rFaktoriyel*nrFaktoriyel)));
    }
}
