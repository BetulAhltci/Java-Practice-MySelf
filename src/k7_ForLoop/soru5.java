package k7_ForLoop;

public class soru5 {
    public static void main(String[] args) {
        /*
        Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin.
         */

        int input=3;
        int deger=1;

        for (int i = 1; i <=input ; i++) {
            deger*=i;
        }
        System.out.println(deger);
    }
}
