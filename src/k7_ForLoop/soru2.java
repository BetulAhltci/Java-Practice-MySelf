package k7_ForLoop;

public class soru2 {
    public static void main(String[] args) {
        /*
        - Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
            dahil) 7 ila bolunebilen sayilari yazdirin.
         */

      int sayi= 70;

        for (int i = sayi; i >0; i--) {
            if (i%7==0){
                System.out.print(i +" ");
            }
        }
    }
}
