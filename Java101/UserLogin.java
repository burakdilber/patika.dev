import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword, yn;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız ! ");
        } else {
            System.out.println("Bilgileriniz Yanlış !");
            System.out.println("Şifrenizi sıfırlamak istiyor musunuz ?\n1-Evet\n2-Hayır");
            System.out.print("Seçiminiz : ");
            yn = input.nextLine();
            if (yn.equals("1")) {
                System.out.print("Lütfen yeni şifrenizi giriniz !\nYeni şifreniz : ");
                newPassword = input.nextLine();
                if (newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz !");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            } else {
                System.out.println("Programdan çıktınız !");
            }
        }
    }
}
