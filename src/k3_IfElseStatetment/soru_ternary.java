package k3_IfElseStatetment;

public class soru_ternary {
    public static void main(String[] args) {
        //Üç sayı kabul eden ve en büyük sayıyı bulan Java programını yazınız.
        int sayi1=5;
        int sayi2=6;
        int sayi3=7;

        System.out.println((sayi1>sayi2&&sayi1>sayi3)?(sayi1 + "enbüyük sayı"):
                (sayi2>sayi1&&sayi2>sayi3)?(sayi2 + "enbüyük sayı"):sayi3 + "enbüyük sayı");

    }
}
