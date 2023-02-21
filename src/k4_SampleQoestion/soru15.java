package k4_SampleQoestion;

public class soru15 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 2 isim/kelime alın: isim1 ve isim2
        -> isim1 çift sayıda karaktere sahipse, ikinci kelimeyi ilk kelimenin ortasına ekleyin
        -> ilk sözcükte tek sayılar varsa,  'isim2, isim1'e eklenemez" ifadesini yazdırın.
        Ipucu: If Else ve String Manipulation konusunu hatırlayalım!  Substring,concat,lengt...
        Örn:
	    isim1= masa
         isim2= ali
	    Konsol => maalis */

        String isim1="Java";
        String isim2="Candır";
        int krkisim1=isim1.length();

        if (krkisim1%2==0){
            System.out.println("Ja"+isim2.concat(isim1.substring(2)));
        }else{
            System.out.println(isim2+ isim1+"e eklenemez");

        }

    }
}
