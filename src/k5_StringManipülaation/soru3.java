package k5_StringManipülaation;

public class soru3 {
    public static void main(String[] args) {
        /*
        : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
        icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
        - String aranan metni icermiyor
        - Aranan metin String’de sadece 1 kere kullanilmis
        - Aranan metin String’de sadece 1’den fazla kullanilmis
         */
        String cumle="ataata";
        String metin="k";
        int sayac=0;
        int index=0;



        while (index<cumle.length()) {

            index = cumle.indexOf(metin, index);
            if (index == -1) {
                if (sayac == 0) {
                    System.out.println("String aranan metni icermiyor");
                    System.exit(0);
                } else if (sayac == 1) {
                    System.out.println("Aranan metin String’de sadece 1 kere kullanilmis");
                    System.exit(0);
                } else {
                    System.out.println(" Aranan metin String’de sadece 1’den fazla kullanilmis");
                    System.exit(0);
                }
            } else {
                sayac++;
                index++;
            }
        }

    }
}
