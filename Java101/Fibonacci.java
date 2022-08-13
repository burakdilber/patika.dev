import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, a = 0, b = 1, c = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci Serisinin Eleman Sayısını Giriniz : ");
        n = input.nextInt();

        for (int i = 1; i <= n - 2; i++) {
            c = a + b;
            a = b;
            b = c;

            System.out.print(c + " ");
        }

    }
}
