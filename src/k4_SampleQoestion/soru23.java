package k4_SampleQoestion;

public class soru23 {
    public static void main(String[] args) {
        /*
        Girdi olarak bir tamsayı kabul eden
        ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
        Method bize çıktıyı döndürsün.
        Örnek:
        Girdi: 6
        Çıktı: 6!=65432*1=720
        ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.
         */

        int sayı=5;

        System.out.println( sayı+"! = "+faktöriyel(sayı));

    }

    public static int faktöriyel(int sayı) {
        int hesaplanan=1;

        for (int i =sayı; i>0 ; i--) {
            hesaplanan*=i;
        }
        return hesaplanan;
    }
}
