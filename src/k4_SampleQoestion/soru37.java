package k4_SampleQoestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru37 {
    public static void main(String[] args) {
        /*
        (Tekrarlananları çıkar)
        TÜR:
        Tekrarlanan kayıtların çıkarıldığı yeni bir dizi döndüren aşağıdaki başlıga sahip bir metot yazınız.
        On tane tamsayı alan ve bu metodu çağırarak sonucu gösteren bir test programı yazınız.
        ---->>>
        public static int[] eliminateDuplicates(int[] list)
        ÖRNEK:
        On sayi giriniz:
        1 2 3 2 1 6 3 4 5 2
        ÇIKTI:
        Birbirinden farkli girilen sayilar: 1 2 3 6 4 5

         */

        int[]arr={1, 2, 3, 2, 1, 6, 3, 4, 5, 2};

      eliminateDuplicates(arr);

    }

    private static int[] eliminateDuplicates(int[] arr) {

        List<Integer> list=new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {

           // if (!(list.contains(arr[i]))){

                //list.add(arr[i]);
            if (!(list.contains(arr[i]))){

                list.add(arr[i]);

            }
        }
       // int[] tek= new int[list.size()];
       // for (int i = 0; i<=list.size() ; i++) {
        int[] tek= new int[list.size()];
        for (int i = 0; i<list.size() ; i++) {

            tek[i]=list.get(i);
        }
        System.out.println(Arrays.toString(tek));

        return tek;

    }
}
