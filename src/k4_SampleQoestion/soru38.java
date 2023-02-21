package k4_SampleQoestion;

import java.util.Arrays;

public class soru38 {
    public static void main(String[] args) {
        /*
        Bir tamsayı dizisini (Int Array) girdi olarak kabul eden ve verilen bu (Arrayden) diziden
    minimum ve maksimum sayıları yazdıran bir yöntem yazın
    Örnek:
    Input : {3,2,5,4,1,6}
    Output :
    min: 1
    max: 6
    Ipucu: sort yöntemni kullanabilirsiniz.*/

        int[] arr = { 3, 5, 4, 6,86};

        maxMinDeger(arr);

    }

    private static void maxMinDeger(int[] arr) {
        int max =arr[0];
        int min =arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i]<=min){
                min=arr[i];
            }
        }
        System.out.println("max değer= "+max+"\nmin deger= "+min);

    }
}







