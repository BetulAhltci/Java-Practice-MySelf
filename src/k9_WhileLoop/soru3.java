package k9_WhileLoop;

public class soru3 {
    public static void main(String[] args) {
        /*
        While loop kullanarak 2 basamakli 7 ile bolunebilen pozitif tamsayilari
        yazdirin.
         */

        int i=10;
       while (i<100){
           if (i%7==0){
               System.out.print(i+" ");
           }
           i++;
       }
    }
}
