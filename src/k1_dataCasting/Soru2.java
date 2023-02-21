package k1_dataCasting;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {

        // kullanıcıdan bir harf alın ve o harftrn sonraki 3 harfi yazdırın

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        System.out.println((char)(krk+1)+","+(char)(krk+2)+","+(char)(krk+3));


    }
}
