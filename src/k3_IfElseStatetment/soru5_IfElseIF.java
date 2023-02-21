package k3_IfElseStatetment;

import java.util.Scanner;

public class soru5_IfElseIF {
    public static void main(String[] args) {
         /*öğrencinin notu 85 ise AA,
        (85 ve üstü değilse)65 ve üstü iseBB
        (65 ve üstü değise)50 ve üstü ise CC
        (geriye kalan) DD
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not=scan.nextInt();

        if(not<0||not>100) {
            System.out.println("geçersiz not");
        }else if (not>=85) {
            System.out.println("AA");
        }else if (not>=65) {
            System.out.println("BB");
        }else if(not>=50) {
            System.out.println("CC");
        }else System.out.println("DD");

        }

    }


