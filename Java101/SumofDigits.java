import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, tempNumber, busNumber = 0, basValue, total = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz : ");
        number = input.nextInt();

        tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            busNumber++;
        }

        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            total += basValue;
            tempNumber /= 10;
        }

        System.out.println("Basamak Sayılarının Toplamı : " + total);
    }
}
