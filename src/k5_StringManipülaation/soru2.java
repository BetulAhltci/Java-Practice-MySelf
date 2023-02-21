package k5_StringManipülaation;

public class soru2 {
    public static void main(String[] args) {
       /* Kullanicidan bir cumle alin
        - cumlede ev geciyorsa, "home home sweet home" yazdirin
        - cumlede is geciyorsa, "calismak guzeldir"
        - ikisini de iceriyorsa "Hem ev lazim hem is"
        - hicbirini icermiyorsa "cok calisman lazim" yazdirin */

        String cumle= " is bitmiyor.";

        if (cumle.contains("ev") && cumle.contains("is")){
            System.out.println("Hem ev lazim hem is");
        }else if (cumle.contains("is")){
            System.out.println("calismak guzeldir");
        }else if (cumle.contains("ev")){
            System.out.println("home home sweet home");
        }else{
            System.out.println("cok calisman lazim");
        }


    }
}
