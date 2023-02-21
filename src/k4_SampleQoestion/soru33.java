package k4_SampleQoestion;

import java.util.Arrays;

public class soru33 {
    public static void main(String[] args) {
        /*
        Array kullanarak String bir cümleyi Reverse eden (tersine çeviren) bir Java programı yazın
         (boşluklar ve özel karakterler dahil).
        Örnek:	
        String str=''Kodlama harika.''
        String arr[]: ".etaerg si gnidoC"
        İpucu: Önce Split kullanarak Arraye çevirin ardından Loop kullanarak son karakterden başlayıp tersten yazdırın
         */

        String str="Kodlama harika.";
        String[] stra=str.split("");
        String[] terstra=new String[stra.length];
        int index=0;

        for (int i = stra.length-1; i >=0 ; i--) {

            terstra[index]=stra[i];
            index++;

        }
        System.out.println(Arrays.toString(terstra));
        
        
        
    }
}
