package k4_SampleQoestion;

import java.util.Arrays;
import java.util.Scanner;

public class soru32 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan alacagınız bilgilerle oluşturdugunuz
        bir Integer Array dizesini Reverse olarak (tersten) yazdırınız.
İpucu:  int arrReverse[] diye bir array oluşturun ve kullancıya oluşturdugunuz arrayi buna tersten assign edin...
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("arrayin uzunluğunu giriniz");
        int sayi=scan.nextInt();
        int[]arr=new int[sayi];
        int index=0;

        do {
            System.out.println("Arrayin uzunluğu kadar karakter giriniz");
            int deger=scan.nextInt();
            arr[index]=deger;
            index++;
        }while (index<arr.length);

        int[] arrReverse=new int[arr.length];// 1,2,3
        int sayac=0;

        for (int i = arrReverse.length-1; 0<=i ; i--) {
            arrReverse[sayac]=arr[i];
            sayac++;
        }
        System.out.println(Arrays.toString(arrReverse));



    }
}
