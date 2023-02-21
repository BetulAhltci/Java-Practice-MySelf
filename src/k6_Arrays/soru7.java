package k6_Arrays;

import java.util.Arrays;

public class soru7 {
    public static void main(String[] args) {

        //erilen bir array deki tüm elemanları bir sağa kaydırp
        // sondaki elemanıda basa tasıyacak bir metod olustup
        //yeni array i yazdırın

        int[]arr={4,5,6,7};
        arr=sayılarıKaydır(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] sayılarıKaydır(int[] arr){
         int temp=arr[arr.length-1];

        for (int i = arr.length-1; i >=1; i--) {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;
    }


}
