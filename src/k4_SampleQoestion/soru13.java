package k4_SampleQoestion;

public class soru13 {
    public static void main(String[] args) {
       /* Soru 13-)
        Char cevap değişkeninin değerini test edelim ve aşağıdaki eylemleri gerçekleştiren bir kod yazalım:
        Cevap a ise, konsolda 'İsteğiniz işleniyor' mesajı yazsın
        Yanıt b ise, konsolda 'Değerlendirmeniz için yine de teşekkür ederiz' mesajı yazsın
        Yanıt c ise 'Üzgünüm şuanda yardımcı olamıyoruz' mesajı,
                Yanıtın başka bir değeri için ise 'Geçersiz giriş, lütfen tekrar deneyin!' mesajı yazdırılsın.
        Ipucu:
        Switch konusunu hatırlayalım!*/

        char cevap='k';
        switch (cevap){
            case 'a':
                System.out.println("İstediğiniz İşleniyor");
                break;
            case 'b':
                System.out.println("Değerlendirmeniz için yine de teşekkür ederiz");
                break;
            case 'c':
                System.out.println("üzgünüm şuanda yardımcı olamıyorum");
                break;
            default:
                System.out.println("geçersiz giriş lütfen tekrar deneyin");
        }




    }
}
