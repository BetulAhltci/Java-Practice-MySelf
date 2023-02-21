package k4_SampleQoestion;

import java.util.Scanner;

public class soru21 {
    public static void main(String[] args) {
        /*
        Bir aydaki gün sayısını bulmak için bir Java programı yazın
(Mülakat Sorusu / Interview Sorusu / Leak Year)

Örnek:
Bir ay numarası girin: 2
Bir yıl girin: 2016

Şubat 2016'da 29 gün vardır
ipucu:
Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir.
Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
ipucu2:
ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ay numarası giriniz giriniz");
        int ay = scan.nextInt();
        System.out.println("bir yıl giriniz");
        int yıl = scan.nextInt();

       switch (ay) {
           case 1:
               System.out.println(yıl + " yılında " + ay + ". ay 31 gündür");
               break;
           case 2:
               System.out.println(artıkYılBulma(yıl) ? yıl + " artık yıl. " + ay + ". ay 29 gün" : ay + ". ay 28 gün");
               break;
           case 3:
               System.out.println(yıl + " yılında " + ay + ". ay 31 gündür");
               break;
           case 4:
               System.out.println(yıl + " yılında " + ay + ". ay 30 gündür");
               break;
           case 5:
               System.out.println(yıl + " yılında " + ay + ". ay 31 gündür");
               break;
           case 6:
               System.out.println(yıl + " yılında " + ay + ". ay 30 gündür");
               break;
           case 7:
               System.out.println(yıl + " yılında " + ay + ". ay 31 gündür");
               break;
           case 8:
               System.out.println(yıl + " yılında " + ay + ". ay 31 gündür");
               break;
           case 9:
               System.out.println(yıl + " yılında " + ay + ". ay 30 gündür");
               break;
           case 10:
               System.out.println(yıl + " yılında " + ay + ". ay 31 gündür");
               break;
           case 11:
               System.out.println(yıl + " yılında " + ay + ". ay 30 gündür");
               break;
           case 12:
               System.out.println(yıl + " yılında " + ay + ". ay 31 gündür");
               break;
           default:
               System.out.println("hatalı giriş");

               System.out.println("________________________________________");
       }

           /*     switch (ay){
         case 1:
         case 3:
         case 5:
         case 7:
         case 8:
         case 10:
         case 12:
             System.out.println(yıl+ " yılında "+ ay +". ay 31 gündür");
             break;
         case 4:
         case 6:
         case 9:
         case 11:
             System.out.println(yıl+ " yılında "+ ay +". ay 30 gündür");
             break;
         case 2:
             System.out.println(artıkYılBulma(yıl)? yıl+ " artık yıl. "+ ay+". ay 29 gün": ay+". ay 28 gün");
             break;
         default:
             System.out.println("hatalı giriş");
        }*/

        }

        public static boolean artıkYılBulma(int yıl) {
        boolean artıkyıl;
        if ((!(yıl % 100 == 0) && yıl % 4 == 0) || ((yıl % 100 == 0 && yıl % 400 == 0))) {
            artıkyıl = true;
        } else {
            artıkyıl = false;
        }

        return artıkyıl;


    }
}
