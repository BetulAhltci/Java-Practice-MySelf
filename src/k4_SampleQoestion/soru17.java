package k4_SampleQoestion;

import java.util.Scanner;

public class soru17 {
    public static void main(String[] args) {
       /* Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından isimde karakterin kaç kez tekrarlandığını kontrol edelim.
                Örnek:
        char ch1=            'a'
        String name =     "Ali bakkala geç gitti."
        Beklenen Çıktı=    a sayısı = 3
        Ipucu:
        Loop döngülerini hatırlayalım. While döngüsü kullanabilirsiniz!
         Sayac adlı bir int variable oluşturarak bunun ile kelimenin kaç defa geçtigini
          Loop içindeki İf ile bulabilirsiniz!
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir cümle giriniz");
        String str=scan.nextLine();
        System.out.println("aratmak isrediğiniz karakteri giriniz");
        char krk= scan.next().charAt(0);
        int sayac=0;
        int index=0;



        while (index<str.length()){
            if (krk==str.charAt(index)){
                sayac++;
            }
        index++;
        }
        System.out.println(sayac+ " tane "+ krk+ " var ");


    }
}
