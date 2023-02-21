package k4_SampleQoestion;

import java.util.Arrays;

public class soru40 {
    public static void main(String[] args) {
        /*
        Parametre olarak 2 Int Array kabul eden ve 2 Array listesini yeni bir Arraye ekleyen ve yazdıran bir method yazın.
		 * Input1={1,2,3,4}
		 * Input2={5,6}
		 * Çıktı={1,2,3,4,5,6}
         */

       int[] input1={1,2,3,4};
       int[] input2={5,6,7,8};
       birlesikArray(input1,input2);



    }

    private static void birlesikArray(int[] input1, int[] input2) {
        int[] birlesikarr=new int[input1.length+input2.length];

        for (int i = 0; i <input1.length ; i++) {
            birlesikarr[i]+=input1[i];
        }
        for (int i = 0; i <input2.length ; i++) {
            birlesikarr[input2.length+i]+=input2[i];

        }
        System.out.println(Arrays.toString(birlesikarr));
    }


}
