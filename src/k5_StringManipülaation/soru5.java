package k5_StringManipülaation;

public class soru5 {
    public static void main(String[] args) {
        /*
        : Kullanicidan alinan metindeki istenmeyen rakam ve ozel karakterleri silip,
            sadece ilk harfi buyuk diger harfler kucuk harf yapan bir program yazin.
            input : java1 ogRe2@nMek3 #ne +Gu=zel
            output : Java ogrenmek ne guzel.
         */

        String cumle="java1 ogRe2@nMek3 #ne +Gu=zel";
        cumle=cumle.replaceAll("\\d","");
        System.out.println(cumle);

        cumle=cumle.replaceAll("\\s","5");
        System.out.println(cumle);

        cumle=cumle.replaceAll("\\W","");
        System.out.println(cumle);

        cumle=cumle.replaceAll("\\d"," ");
        System.out.println(cumle);

      cumle=cumle.substring(0,1).toUpperCase()+cumle.substring(1).toLowerCase();
        System.out.println(cumle);

    }
}
