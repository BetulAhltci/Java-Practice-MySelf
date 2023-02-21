package k4_SampleQoestion;

import java.util.Scanner;

public class soru19 {
    public static void main(String[] args) {
    /*
    Kullanıcıdan doğum tarihini alınız. Burcunu hesaplayan bir method yazınız.
    ipucu:
    Switch Case kullanabilirsiniz. Veya Method yazarak Method aracılıgı ile de yapabilirsiniz.
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Hangi ayda doğduğunuzu giriniz");
        String ay=scan.next().toLowerCase();
        System.out.println("ayın kaçına doğdunuz");
        int gün= scan.nextInt();

        switch (ay) {
            case "ocak":
                System.out.println(gün<=21?"Oglak":"Kova");
                break;
            case "subat":
                System.out.println(gün<=21?"Kova":"Balık");
                break;
            case "mart":
                System.out.println(gün <=21 ? "Balık" : "Koç");
                break;
            case "nisan":
                System.out.println(gün <= 21 ? "Koç" : "Boğa");
                break;
            case "mayıs":
                System.out.println(gün <= 21 ? "Boğa" : "İkizler");
                break;
            case "haziran":
                System.out.println(gün <= 21 ? "İkizler" : "Yengeç");
                break;
            case "temmuz":
                System.out.println(gün <= 21 ? "Yengeç" : "Aslan");
                break;
            case "ağustos":
                System.out.println(gün <= 21 ? "Aslan" : "Başak");
                break;
            case "eylül":
                System.out.println(gün <= 21 ? "Başak" : "Terazi");
                break;
            case "ekim":
                System.out.println(gün <= 21 ? "Terazi" : "Akrep");
                break;
            case "kasım":
                System.out.println(gün <= 21 ? "Akrep" : "Yay");
                break;
            case "aralık":
                System.out.println(gün <= 21 ? "Yay" : "Oğlak");

            default:
                System.out.println("geçersi giriş");

        }














        }

    }

