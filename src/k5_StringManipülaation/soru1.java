package k5_StringManipülaation;

public class soru1 {
    public static void main(String[] args) {
      /*
        SORU : kullanicidan bir mail alin

        - mail @ icermiyorsa "gecersiz mail"
                - mail @gmail.com icermiyorsa, "mail gmail olmali"
                - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var"
        yazdirin.*/

        String mail = " ";

        if (!(mail.contains("@"))) {
            System.out.println("geçersiz mail");
        }
        if (!(mail.contains("@gmail.com"))) {
            System.out.println("mail gmail olmalı");
        }
        if (!(mail.endsWith("@gmail.com"))) {
            System.out.println("mailde yazım hatası var");
        }
    }
}
