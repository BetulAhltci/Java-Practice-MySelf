package k4_SampleQoestion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class soru30 {



    public static void main(String[] args) {
        /*
        Bir Stringdeki yinelenen karakterleri Array String olarak döndüren bir kod yazın.
        ( mülakat sorusu )
        Örnek:
        String str="Javacokkolay"
        Yinelenen karakterler : [a, o, k]
        İpucu: İçiçe for looplar, String Manupulations ve ifler kullanrak çözebilrsiniz.
            Stringdeki bir harfi Stringde bulunan diger harfler ile
             karşılaştırıp konteynıra atacaksınız bu yüzden iç içe loop kullanmak mantıklı duruyor
         */

        String str = "Javacokkolay";
        String istenen = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && (!istenen.contains(str.charAt(i) + ""))) {
                    ;
                    istenen = istenen + str.charAt(i);
                }
            }
        }

        String[] istenenarray=istenen.split("");
        System.out.println(Arrays.toString(istenenarray));












            }

        }






