package k6_Arrays;

public class soru5 {
    public static void main(String[] args) {

        // bir marketin fiyatlarını tutan bir array var
        // bu marketteki en yüksek ve en düşük fiyatları yazdıran bir metod oluşturun

        double[] fiyatlar={23,34.5,42.1,5.7,3.4,23.5};

        enYüksekenDusukFiyat(fiyatlar);

    }

    public static void enYüksekenDusukFiyat(double[] arr){

        double endüsükfiyat=arr[0];
        double enyüksekfiyat=arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (endüsükfiyat>arr[i]){
                endüsükfiyat=arr[i];
            }
            if (enyüksekfiyat<arr[i]){
                enyüksekfiyat=arr[i];
            }


        }

        System.out.println("listedeki en düşük fiyat: "+endüsükfiyat);
        System.out.println("listedeki en yüksek fiyat: "+enyüksekfiyat);


    }




}
