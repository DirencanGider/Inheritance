public class Yonetici extends Calisan { //Bu sınıf bir alt sınıf olacağı için; "Subclass" ifadesini kullanacağız.

    private int sorumlu_kisi; //Ekstra özellik(feature) ekledik. Bu özellik miras aldığımız Calisan class'ında bulunmuyor. Aşağıdaki constructor içinede yazıyoruz.
    public Yonetici (String isim, int maas, String departman, int sorumlu_kisi) {
        /*
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;

        -Calisan class'ındaki constructor'ı kullandık fakat hata vermeye devam etti. Private access  modifier(erişim belirleyici)'a sahip featurelara direkt olarak erişemedik.

        -Calisan içerisindeki constructor'ı zaten miras almıştık. Bu consructor içerisindeki metodu kullanarak onu çağıracağız.

        Normalde this() ifadesini kullanıyorduk. Direkt içerisinde bulunduğumuz objemizi temsil ediyordu ve constructorlarımız bu anahtar kelimeyle kullanıyorduk. Fakat biz
        super class olan Calisan classındaki constructor'ı kullanacağımız için super ifadesini kullanacağız. Ve o constructor içerisindeki değerleri yazacağız.
        */

        super(isim, maas, departman);

        this.sorumlu_kisi = sorumlu_kisi;

        /*Yukarıda ekstra özellik ekledikten sonra bu kısımda bu özelliği de yine belirtmiş olduk. Sonrasında Test.java'ya dönerek
         oluşturduğumuz yonetici1 objesinin constructor'ının içine de Sorumlu Olduğu Kişi Sayısını da ekliyoruz.
         */


    }
    public void zam_yap(int zam_miktari) { //En son ekstra metod ekledik.

        System.out.println("Çalışanlara " + zam_miktari + " TL zam yapıldı.");

    }
    public void bilgileriGoster() {  //Metodu overriding yaptık.

        /*
        Superclass olan Calisan classında bu metod yazılıydı. Bu metodun içerisine ekstra özellik eklemek istiyoruz.
        Yonetici subclass'ında bu metodu aynı şekilde yazarak Override işlemini  gerçekleştirmiş oluyoruz.
        Yani artık miras aldığımız Superclass olan Calisan içerisinde bu metod özelliğini yitirecek ve geçersiz olacak. Burada oluşturduğumuz
        yeni metod çalışacak. Calisan içindeki metodu geçirirken isim,  maas ve departmanı direkt olarak çağıramayacağımız için Superclassta Getter ve Setter metodlarını
        oluşturduk ve burada da aşağıda görüldüğü gibi metod içerisinde çağırdık.
         */

        /*
        System.out.println("İsim : " + getIsim());
        System.out.println("Maaş : " + getMaas());
        System.out.println("Departman : " + getDepartman());
        System.out.println("Sorumlu Olduğu Kişi Sayısı : " + this.sorumlu_kisi); //Bunu bu classta oluşturmuştuk. Buraya da eklemiş olduk.
        */

        super(bilgileriGoster()) { //EN SON ADIM. ALERNATİF/!\: Calisan classından direkt olarak super anahtar kelimesi ile metodu çağırabiliyoruz. Üstteki gibi zahmet etmeden.

            System.out.println("Sorumlu Olduğu Kişi Sayısı : " + this.sorumlu_kisi); //Calisan classından direkt super ifadesi ile çağırdıktan sonra sadece bu ekstrayı ekledik.

        }




    }

}