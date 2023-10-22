import java.util.Scanner;

public class usluSayi {
    public static void main(String[] args) {
        int k, n, total = 1;
        Scanner input;

        input = new Scanner(System.in);
        System.out.print("Lütfen üs sayısını giriniz : ");
        n = input.nextInt();
        System.out.print("Lütfen üssü alınacak sayıyı girini : ");
        k = input.nextInt();

        for (int i = 1; i <= n; i++) {
            total = total * k;
        }
        System.out.println("Sonuç : " + total);
    }
}
