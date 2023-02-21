package k4_SampleQoestion;

public class soru36 {
    public static void main(String[] args) {
        //Verilen bir Array dizisindeki ortadaki degeri döndüren bir kod/method yazın.
        // ( Yapabilirseniz Dinamik kod yazmaya çalışın, Arrayin uzunlugu degişse de ortadaki elemanı getirsin)
        //Örnek:
        //inputarr[]=   {1,2,3,4,5,6,7}
        //output:         4
        //İpucu:  Arrayin indexini hesaplayarak bulabilirsiniz.
        // Kendinizi geliştirme adına sorunun cevabını degişik yollardan yapabilir,
        // Arrayi kullanıcıya oluşturabilirsiniz (Öneri..)

        int[] arr={1,2,3,4,5,6,7,6,6,1};

        System.out.println(ortadakiEleman(arr));


    }

    private static int ortadakiEleman(int[] arr) {
        int orta = 0;

        for (int i = 0; i <arr.length ; i++) {

            orta=(arr.length/2)+1;

            if (arr.length%2==0){
                orta=((arr.length/2))+(arr.length/2+1);
            }

        }
        return orta;
    }
}
