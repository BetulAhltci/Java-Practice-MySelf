package k3_IfElseStatetment;

import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {
        //Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        //sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
        //“istediginiz birim sisteme kayitli degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen km cinsinden bir değer girin");
        int km= scan.nextInt();
        System.out.println("çeevirmek istediğiniz birimi girin"+"\nmetre için m\nsantimetre için c");
        char cevap=scan.next().charAt(0);

        if(cevap=='m'&& km>0)System.out.println(km*1000);
        else if (cevap=='c' && km>0) System.out.println(km*10000);
        else System.out.println("istediğiniz birimsisteme kayıtlı değil");
    }
}
