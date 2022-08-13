import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2, ebob = 1;

        Scanner input = new Scanner(System.in);

        System.out.print("N1 sayısını giriniz :");
        n1 = input.nextInt();
        System.out.print("N2 sayısını giriniz : ");
        n2 = input.nextInt();

        int i = 1, k = 1;
        while(i <= n1) {
            if(n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB: " + ebob);

        while (k <= (n1 * n2)) {
            if(k % n1 == 0 && k % n2 == 0) {
                System.out.println("EKOK: " + k);
                break;
            }
            k++;
        }
    }
}
