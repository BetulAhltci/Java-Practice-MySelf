package k6_Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class soru2 {
    public static void main(String[] args) {

        //verilen bir int arraydek tüm elementleri 5 arttırın

        int[] arr={1,2,3,4,5};

        for (int i = 0; i <arr.length ; i++) {
             arr[i]+=5;
        }
        System.out.println(Arrays.toString(arr));

    }

}
