package k7_ForLoop;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        /*
        Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("baslangıc icin pozitif tam sayı giriniz");
        int bas=scan.nextInt();
        System.out.println("bitis icin pozitif tam sayı giriniz");
        int bit=scan.nextInt();
        int top=0;

        for (int i = bas; i <=bit ; i++) {
            top=top+i;
        }
        System.out.println(top);
        if (bas>bit){
            System.out.println("bitis degeri baslangıcdan kücuk olamaz." );
        }

    }
}
