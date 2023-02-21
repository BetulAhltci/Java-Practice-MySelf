package k3_IfElseStatetment;

public class soru10 {
    public static void main(String[] args) {
        // Üç sayı kabul eden ve en büyük sayıyı bulan Java programını yazınız.
        // ornek:
        // • Giriş:
        // İlk sayı: 4
        // İkinci sayi: 8
        //Üçüncü sayı: 1

        int sayı1 = -255;
        int sayı2 = 8;
        int sayı3 = 20;

        if (sayı1 > sayı2 && sayı1 > sayı3) {
            System.out.println(sayı1 + " büyük sayı");
        } else if (sayı2 > sayı1 && sayı2 > sayı3) {
            System.out.println(sayı2 + " büyük sayı");

        } else if (sayı3 > sayı1 && sayı3 > sayı2) {
            System.out.println(sayı3 + " büyük sayı");

        } else System.out.println("geçersiz giris");
    }
}
