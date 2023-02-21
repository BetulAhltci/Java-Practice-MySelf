package k3_IfElseStatetment;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        //kullanıcıdan bir karakter isteyin
        //girilen karakterin buyuk harf olup olmadığını girin

        Scanner scan=new Scanner(System.in);
        System.out.println("bir karakter girin");
        char krk= scan.next().charAt(0);

        if(krk>='A'&&krk<='Z'){
            System.out.println("büyük harf");
        }else {
            System.out.println("büyük harf değil");
        }
    }
}
