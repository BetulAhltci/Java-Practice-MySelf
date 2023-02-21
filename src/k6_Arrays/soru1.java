package k6_Arrays;

import java.util.Arrays;

public class soru1 {
    public static void main(String[] args) {

        //verilen bir array in tüm elementlerini yadırın
        int[] arr={1,2,3,4,5};

        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]+" ");//1 2 3 4 5
        }




    }
}
