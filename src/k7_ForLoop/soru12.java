package k7_ForLoop;

public class soru12 {
    public static void main(String[] args) {
        /*
        – Asagidaki sekilleri yazdirin
        *          * * * * * * *       * * * * *
        * *        * * * * * * *       * * *
        * * *      * * * * * * *       * *
        * * * *    * * * * * * *       *

         */

        System.out.println("=====1.Sekil=====");

        int satir=4;
        for (int i = 0; i <=satir ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }

        System.out.println("=====2.Sekil=====");

        int uzunkenar=7;
        int kısakenar=4;

        for (int i = 1; i <=kısakenar ; i++) {
            for (int j = 1; j <=uzunkenar ; j++) {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }

        System.out.println("=====3.Sekil=====");
        int deger=4;

        for (int i = deger; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("*"+" ");
            }
            System.out.println("");
        }



    }
}
