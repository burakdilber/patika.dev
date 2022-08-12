import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mesafe, yas, tip;
        double tutar, toplamTutar;
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı Giriniz : ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini Giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) : ");
        tip = input.nextInt();

        tutar = mesafe * 0.10;

        if (mesafe < 0) {
            isError = true;
        }

        if (yas < 0) {
            isError = true;
        }

        if (tip > 2 || tip < 1) {
            isError = true;
        }

        if (yas < 12) {
            if (tip == 2) {
                toplamTutar = ((tutar - (tutar * 0.5)) - ((tutar - (tutar * 0.5)) * 0.2)) * 2;
            } else {
                toplamTutar = tutar - (tutar * 0.5);
            }
        } else if (yas > 12 && yas < 24) {
            if (tip == 2) {
                toplamTutar = ((tutar - (tutar * 0.1)) - ((tutar - (tutar * 0.1)) * 0.2)) * 2;
            } else {
                toplamTutar = tutar - (tutar * 0.1);
            }
        } else if(yas > 64) {
            if (tip == 2) {
                toplamTutar = ((tutar - (tutar * 0.3)) - ((tutar - (tutar * 0.3)) * 0.2)) * 2;
            } else {
                toplamTutar = tutar - (tutar * 0.3);
            }
        } else {
            if (tip == 2) {
                toplamTutar = tutar * 2;
            } else {
                toplamTutar = tutar;
            }
        }

        if (isError) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        }
    }
}
