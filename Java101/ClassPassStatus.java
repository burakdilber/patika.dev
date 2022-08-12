import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuz : ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        if (matematik < 0 || matematik > 100) {
            matematik = 0;
        }

        if (fizik < 0 || fizik > 100) {
            fizik = 0;
        }

        if (turkce < 0 || turkce > 100) {
            turkce = 0;
        }

        if (kimya < 0 || kimya > 100) {
            kimya = 0;
        }

        if (muzik < 0 || muzik > 100) {
            muzik = 0;
        }

        double average = (matematik + fizik + turkce + kimya + muzik) / 5;

        if (average <= 55) {
            System.out.println("Sınıfta kaldınız, seneye tekrar görüşmek üzere ! ");
        } else {
            System.out.println("Tebrikler, Sınıfı geçtiniz ! ");
        }
        System.out.println("Ortalamanız : " + average);
    }
}
