package k4_SampleQoestion;

import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {
        // Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
        //
        // **indeks Hesaplama: İPUCU : Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m)
        // If konusunu hatırlayın!***
        //                   Kullanıcıya aşağıdaki gibi mesaj verin:
        //
        //                    Eğer VKİ 18.5'ten az ise --> zayıfsınız
        //                    Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        //                    Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        //                    VKİ 30'a eşit veya daha fazlaysa --> obez


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz");
        double kilo=scan.nextDouble();
        System.out.println("lütfen boyunuzu giriniz");
        double boy=scan.nextDouble();

        double vke=kilo/(boy*boy);

        System.out.println(vke);

        if (vke<=18.5){
            System.out.println("zayıfsınız");
        }else if (vke>18.5&&vke<=25){
            System.out.println("kilo idealdir");
        }else if (vke>25&&vke<=30){
            System.out.println("sismansınız");
        }else{
            System.out.println("obez");
        }





    }
}
