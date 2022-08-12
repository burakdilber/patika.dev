import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, k = 0, toplam = 0, ortalama;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                k++;
                toplam = toplam + i;
            }
        }
        System.out.println("Ortalama : " + (toplam / k));
    }
}
