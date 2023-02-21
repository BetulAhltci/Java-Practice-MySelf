package k6_Arrays;

public class soru6 {
    public static void main(String[] args) {

        //verilen bir arrayde isteden bir elemanın olup olmadığını
        //varsa kaç tane olduğunu yadıran bir metod olusturun

        int[] arr={1,2,3,4,5,6,7,8,9,8,7,4,5,2,6,3};
        int istenen=2;

        ElemanBul(arr,istenen);


    }



    public static void ElemanBul(int[] sayı,int istenen){
        int sayac=0;

        for (int i = 0; i <sayı.length; i++) {

            if(sayı[i]==istenen){
                sayac++;

            }

        }
        if (sayac==0){
            System.out.println(istenen+" bulunamadı");
        }else{
            System.out.println(istenen+" "+ sayac+" tane"+ " var");
        }


    }
}
