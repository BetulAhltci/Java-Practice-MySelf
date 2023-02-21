package k5_StringManipülaation;

public class soru8 {
    public static void main(String[] args) {
        /*
        Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
        yazdirin.
         */

        String input="Java güzell";
        int uzunluk=input.length();

        if(uzunluk%2==0) {

            System.out.println(input.substring(0,input.length()/2).concat(":)"+
                    input.substring(input.length()/2)));
            System.exit(0);
        }
        if(uzunluk!=0){
            System.out.println(input.replace(input.substring(uzunluk/2),":(")+
                    input.substring(input.length()/2+1));


        }


    }
}
