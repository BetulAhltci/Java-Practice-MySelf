package k5_StringManipülaation;

public class soru4 {
    public static void main(String[] args) {
        /*
        Kullanicinin belirli bir formatta verdigi String fiyatlari toplayip yazdirin.
        input1 : “15.30 €” , input2 : “11.40 €”
        output : 26.70 €
         */

        String input1="15.30";
        String input2="11.40";

        double sayi1=Double.parseDouble(input1);
        double sayi2=Double.parseDouble(input2);

        System.out.println(sayi1+sayi2+" €");

    }
}
