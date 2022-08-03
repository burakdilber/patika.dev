import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double fiyat, kdv, sonuc, kdvTutar;

        Scanner inp = new Scanner(System.in);

        System.out.print("Fiyatı giriniz: ");
        fiyat = inp.nextInt();

        kdv = (fiyat > 0)&&(fiyat < 1000)?0.18:0.08;

        kdvTutar = fiyat * kdv;
        sonuc = fiyat + kdvTutar;

        System.out.println("KDV'siz Tutar: " + fiyat);
        System.out.println("KDV Oranı: " + kdv);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + sonuc);
    }
}
