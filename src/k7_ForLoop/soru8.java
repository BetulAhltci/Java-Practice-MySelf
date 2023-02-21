package k7_ForLoop;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        tamsayilari yazdirin, sira
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
        yazdirin
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz");
        int sayi=scan.nextInt();


        for (int i = 0; i <= sayi; i++) {

            if (i%3==0 && i%5==0){
                System.out.println(" fizzBuzz ");
            }else if (i%3==0){
                System.out.print(" fizz ");
            }else if (i%5==0){
                System.out.println(" buzz ");
            }else{
                System.out.print(i+" ");
            }

        }

    }
}
