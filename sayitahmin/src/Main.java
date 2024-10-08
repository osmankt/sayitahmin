import java.util.Random;
import java.util.Scanner;

class sayitahmin {
    public static void main(String[] args) {
        Random random = new Random();
        int rastgeleSayi = random.nextInt(100) + 1; // 1 ile 100 arasında rastgele bir sayı
        Scanner scanner = new Scanner(System.in);
        int tahmin;
        int hak = 3; // Kullanıcının 3 hakkı var

        System.out.println("1 ile 100 arasında bir sayı tahmin edin. Toplam 3 hakkınız var!");

        while (hak > 0) {
            System.out.print("Tahmininizi girin: ");
            tahmin = scanner.nextInt();

            if (tahmin == rastgeleSayi) {
                System.out.println("Tebrikler, bildiniz!");
                break;
            } else {
                hak--;
                if (hak > 0) {
                    System.out.println("Yanlış tahmin! Kalan hakkınız: " + hak);
                } else {
                    System.out.println("Hakkınız kalmadı! Doğru sayı: " + rastgeleSayi);
                }
            }
        }
        scanner.close();
    }
}
