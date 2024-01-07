public class Test {

    public static void main(String[] args) {

        /*
        Inheritance miras demektir. Örneğin göz renginin babadan veya anneden çocuğa geçmesi gibi.
        Ya da bir fabrika düşünelim. Bu fabrikada İşci ve Yöneticinin ortak özelliği ikisinin de Çalışan olmasıdır.
        2 class oluşturacağız. Çalışan ve Yönetici. Ortak özellikleri ikisinin de çalışan olmasıdır. Yöneticinin özellikleri arasında işcinin özellikleri de mevcuttur. Her class için
        ayrı ayrı bu aynı özellikleri yazmamamk için Inheritance kullanıyoruz.
        Anahtar kelimemiz "IS A" ve "HAS A". Örneğin, Manager IS A Employee. Yönetici bir Çalışandır. Çalışanın bütün özellikleri Yöneticide bulunur.
        */

        Yonetici yonetici1 = new Yonetici ("Direncan Gider", 35000, "IT", 10);
        yonetici1.bilgileriGoster();

        /*
        Normalde bu metodu kullandığımızda sorumlu_kisi bilisi Outputta gözükmüyordu.
        Bu yüzden Superclass olan Calisan class'ından Yonetici subclassına miras aldığımız bilgileriGoster() metodunu overriding ile yeniden Yonetici classında yazdık.
        Overriding yaptıktan sonra Calisan Superclassındaki bu bilgileriGoster metodu özelliğini yitirmiş olacak ve Yonetici Subclassında yeniden yazmış olduğumuz
        aynı metod aktif olarak çalışacak.
        */

        //yonetici1.zam_yap(200);


    }

}
