import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;
        double alan, u;

        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci kenarı giriniz: ");
        a = inp.nextInt();
        System.out.print("İkinci kenarı giriniz: ");
        b = inp.nextInt();
        System.out.print("Üçüncü kenarı giriniz: ");
        c = inp.nextInt();

        u = (a + b + c);
        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Üçgenin Alanı: " + alan);
    }
}
