import java.util.Scanner;

public class Main {
    static int topla(int a, int b) {
        int sonuc = a + b;
        System.out.println("Toplam: " + sonuc);
        return sonuc;
    }

    static int cikar(int a, int b) {
        int sonuc = a - b;
        System.out.println("Toplam: " + sonuc);
        return sonuc;
    }

    static int carpma(int a, int b) {
        int sonuc = a * b;
        System.out.println("Toplam" + sonuc);
        return sonuc;
    }

    static int bolme(int a, int b) {
        int sonuc = a / b;
        System.out.println("Toplam: " + sonuc);
        return sonuc;
    }

    static int uslu(int a, int b) {
        int sonuc = 1;
        for (int i = 1; i <= b; i++) {
            sonuc *= a;
        }

        System.out.println("Toplam: " + sonuc);
        return sonuc;
    }

    static int faktoriyel(int a) {

        for (int i = (a - 1); i >= 1; i--) {
            a *= i;
        }
        System.out.println("Toplam: " + a);
        return a;
    }
    static int mod(int a, int b){
        int sonuc = a % b;
        System.out.println("Toplam: " + sonuc);
        return sonuc;
    }

    static int dikdortgenAlanCevre(int a, int b){
        int alan = a *b;
        int cevre = 2*(a+b);
        System.out.println("Alan: " + alan);
        System.out.println("Cevre " + cevre);
        return alan;

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secim;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Hangi işlemi yapmak istersiniz : ");
            secim = scan.nextInt();

            if (secim == 0) {
                break;
            }


            switch (secim) {
                case 1:
                    System.out.print("İlk Sayıyı Giriniz: ");
                    int a = scan.nextInt();
                    System.out.print("İkinci Sayıyı Giriniz: ");
                    int b = scan.nextInt();
                    topla(a, b);
                    break;
                case 2:
                    System.out.print("İlk Sayıyı Giriniz: ");
                    a = scan.nextInt();
                    System.out.print("İkinci Sayıyı Giriniz: ");
                    b = scan.nextInt();
                    cikar(a, b);
                    break;
                case 3:
                    System.out.print("İlk Sayıyı Giriniz: ");
                    a = scan.nextInt();
                    System.out.print("İkinci Sayıyı Giriniz: ");
                    b = scan.nextInt();
                    carpma(a, b);
                    break;
                case 4:
                    System.out.print("İlk Sayıyı Giriniz: ");
                    a = scan.nextInt();
                    System.out.print("İkinci Sayıyı Giriniz: ");
                    b = scan.nextInt();
                    bolme(a, b);
                    break;
                case 5:
                    System.out.print("İlk Sayıyı Giriniz: ");
                    a = scan.nextInt();
                    System.out.print("İkinci Sayıyı Giriniz: ");
                    b = scan.nextInt();
                    uslu(a, b);
                    break;
                case 6:
                    System.out.print("İlk Sayıyı Giriniz: ");
                    a = scan.nextInt();
                    faktoriyel(a);
                    break;
                case 7:
                    System.out.print("İlk Sayıyı Giriniz: ");
                    a = scan.nextInt();
                    System.out.print("İkinci Sayıyı Giriniz: ");
                    b = scan.nextInt();
                    mod(a,b);
                    break;
                case 8:
                    System.out.println("Kısa kenarı giriniz: ");
                    a = scan.nextInt();
                    System.out.println("Uzun kenarı giriniz: ");
                    b = scan.nextInt();
                    dikdortgenAlanCevre(a,b);
                    break;
            }

        }
        System.out.println("Güle Güle");
    }
}