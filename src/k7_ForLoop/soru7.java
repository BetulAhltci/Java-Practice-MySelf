package k7_ForLoop;

public class soru7 {
    public static void main(String[] args) {
        //- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        int sayi=10;
        int top=0;

        for (int i =0; i <sayi; i++) {
            top+=i;
            System.out.print(sayi-i+"+");
        }
        System.out.println("="+top);



    }
}
