package k4_SampleQoestion;

import java.sql.Array;
import java.util.Arrays;

public class soru35 {
    /*
    Parametre olarak bir isim kabul eden ve ismi bir char Array
    dizisi olarak yazdıran bir method Return edin.
		--> toCharArray() yöntemini kullanmayın
Örnek:
		String isim:    Yakup
		char arr[]:     [Y,a,k,u,p]
İpucu: Bir method içerisinde Array oluşturun ve aldıgınız ismi methoda gönderin.
Bu ismi parçalayarak, her bir harfi, Arraye yerleştirin
     */

    public static void main(String[] args) {
        String isim="Yakup";

        arrayYap(isim);



    }

    private static void arrayYap(String str) {
        char[]arr= new char[str.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=str.charAt(i);
        }
        System.out.println(Arrays.toString(arr));

    }


}
