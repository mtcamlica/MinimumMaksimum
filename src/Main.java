import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int max = 0;
        int min = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz? : ");
        number = input.nextInt();

        for (int i=1; i<=number; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int sayi = input.nextInt();
            if (i==1) {
                max = sayi;
                min = sayi;
            } else {
                if (sayi > max) {
                    max = sayi;
                }
                if (sayi < min) {
                    min = sayi;
                }
            }
        }
        System.out.println("En büyük sayı " + max);
        System.out.print("En küçük sayı " + min);
    }
}
