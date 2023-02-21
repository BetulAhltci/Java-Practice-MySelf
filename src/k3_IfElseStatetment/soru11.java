package k3_IfElseStatetment;

import java.util.Scanner;

public class soru11 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir harf isteyin.
        Kullanıcı birden fazla harf girerse ilk harfin alınmasını sağlayın. (Ö,İ,Ü işleme alınmasın)
        Ayrıca girilen harfte büyük küçük olmasını göz ardı edin.
        Harf sesli harf ise harf sesli bir harftir, değilse girilen harf sesli harf değildir yazdırın.*/

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf griniz");
        char harf= scan.next().toUpperCase().charAt(0);

        switch (harf){
            case 'A':
            case 'U':
            case 'O':
            case 'E':
            case 'I':
                System.out.println("harf sesli bir harftir");
                break;
            default:
                System.out.println("girilen harf sesli harf değildir");}









    }

}
