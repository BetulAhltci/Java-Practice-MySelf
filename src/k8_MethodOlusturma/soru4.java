package k8_MethodOlusturma;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        /*
        - Kullanicidan main method icinde bir tamsayi alin. Girilen sayinin pozitif tam
        bolenleri sayisini bulup bize donduren bir method olusturun.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int number = scanner.nextInt();

        int result = countPositiveDivisors(number);
        System.out.println("Girilen sayının pozitif tam bölen sayısı: " + result);
    }

    public static int countPositiveDivisors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
}
