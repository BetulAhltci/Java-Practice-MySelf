package k4_SampleQoestion;

import java.util.Scanner;

public class soru14 {
    public static void main(String[] args) {
        /*
        Soru 14-)
        Kullanıcıdan bir isim isteyelim. Bu isim 3 harfli olmalıdır.
        Ardından ismin aynı karakterlere sahip olup olmadığını kontrol edelim.
        İsim aynı karakterlere sahipse konsolda "Dize yinelenen karakterlere sahip"
        değil  ise konsolda "Dize benzersiz karakterlere sahip" yazdıralım.
        Ipucu:
        IF/Else veya Ternary kullanabilirsiniz. Harfleri Char ile alıp karşılaştırabilirsiniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("lütfen üç harfli bir metin giriniz");

        String str =scan.next();

        if ((str.charAt(0) == str.charAt(1) || str.charAt(0) == str.charAt(2))  ||
                str.charAt(1)==str.charAt(0)||str.charAt(1)==str.charAt(2) ||
            str.charAt(2)==str.charAt(0)||str.charAt(2)==str.charAt(1)){
            System.out.println("Dize yinelenen karakterlere sahip");
        }else{
            System.out.println("Dize benzersiz karakterlere sahip");
        }

    }
}





