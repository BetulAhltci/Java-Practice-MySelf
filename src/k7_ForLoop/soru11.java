package k7_ForLoop;

public class soru11 {
    public static void main(String[] args) {
        /*
        Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
        kontrol edin ve sonucu yazdirin.
         */
        int sayi=7;

        for (int i = 2; i <=sayi ; i++) {

            if (sayi%i==0){
                System.out.println("sayi asal değil");
                break;
            }else{
                System.out.println("sayi asal");
                break;
            }

        }
    }
}
