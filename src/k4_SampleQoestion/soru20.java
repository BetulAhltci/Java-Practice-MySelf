package k4_SampleQoestion;

public class soru20 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir isim yazmasını isteyin, İsim uzunluğu 3 olmalıdır.
         Daha sonra ismin aynı karakterlere sahip olup olmadığını kontrol edin.
        Dize aynı karakterlere sahipse:  "Dizede yinelenen karakterler var" ;
         aynı karakterlere sahip degilse  "String benzersiz karakterlere sahip"
        yazdırın. İsim 3 karakterden uzunsa "Bu kadar uzun cümleyi anlayamam ben agam" yazdırın.

                Örnek:
                giriş: ama
		        çıkış: Dizede yinelenen karakterler var

                İpucu: İf Else ve Char kullanarak çözebiliriz.
         */

        String s = "aas";
        if (s.length() > 3) {
            System.out.println("Bu kadar uzun cümleyi anlayamam ben agam");
        } else {

            if (s.charAt(0) == s.charAt(1) || s.charAt(0) == s.charAt(2) || s.charAt(1) == s.charAt(2)) {
                System.out.println("Dizede yinelenen karakterler var");
            } else {
                System.out.println("String benzersiz karakterlere sahip");

            }


        }
    }
}

