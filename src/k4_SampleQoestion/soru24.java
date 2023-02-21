package k4_SampleQoestion;

public class soru24 {
    public static void main(String[] args) {
        /*
        20'den 0'a kadar çift sayıları yazdırın ancak decrement (i--) kullanmayın.
        Örnek:
        100'den 0'a kadar Çift Sayılar şunlardır: 20 18 16 14 12 10 8 6 4 2 0
        ipucu:
        Loop içinde if kullanarak çözebilirsiniz. % kullanmak iyi bir fikir olabilir :wink:

         */

        int s1=20;
        do {
            if (s1 % 2 == 0) {
                System.out.print(s1 + " ");
            }
            s1 = s1 - 2;
        } while (s1>=0);


    }
}
