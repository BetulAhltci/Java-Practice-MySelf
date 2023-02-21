package k3_IfElseStatetment;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        ///kullanıcıdan bir harf isteyin
        // girilen karakter küçük harf ise onu buyük harf yazdıralım
        //yosa girilen harfi yazdırın


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir harf giriniz");
        char krk= scan.next().charAt(0);

        if(krk>='a'&&krk<='z'){
            System.out.println((char)(krk-32));
        }else {
            System.out.println((char)krk);
        }
    }
}
