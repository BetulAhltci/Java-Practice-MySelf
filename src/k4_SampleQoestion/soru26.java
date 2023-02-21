package k4_SampleQoestion;

public class soru26 {
    public static void main(String[] args) {
        /*
        Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
        NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
        Örnek:
        Giriş :6
        Çıkış: 6 Mükemmel Sayıdır
        Giriş :7
        Çıkış:7 Mükemmel Sayı Değildir
        ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz :wink:
         */

        int sayı = 6;
        int toplam = 0;

        for (int i = 1; i < sayı; i++) {

            if (sayı % i == 0) {

                toplam +=i;
            }
        }
        if (toplam == sayı) {
            System.out.println(sayı +" mükemmel sayıdır" );
        } else {
            System.out.println(sayı +" mükemmel sayı değil" );
        }
    }
}
