package k4_SampleQoestion;

import java.util.Arrays;
import java.util.Scanner;

public class soru31 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan Arrayin uzunlugunu isteyin.
        Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.
        İpucu:  Önce uzunluk alıp arrayi oluştur daha sonra loop ile kullancııya doldurt
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Array için bi uzunluk giriniz");
        int sayi = scan.nextInt();          // turkce ı kullanmayalım i olarak değiştirdim
        int[] arr = new int[sayi];      // dongunun dışına çıkardım
        int index =0;// arr[i] for dungudeki i yerine index verdim ve index++ ile artışı sağladım

        do {
            System.out.println("Array için bir değer giriniz: ");
            int girilenDeger= scan.nextInt();
            arr[index]= girilenDeger;        // int[] arr..... yerine
            index++;
        }while (index < arr.length );
        System.out.println(Arrays.toString(arr));
    }
}


