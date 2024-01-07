public class Calisan {  // Bu sınıf ana sınıfımız olacağı için şu tabirleri kullanacağız; "Superclass" veya "BaseClass".

    private String isim;
    private int maas;
    private String departman;

    public Calisan(String isim, int maas, String departman) {
        this.isim = isim;
        this.maas = maas;
        this.departman = departman;
    }
    public void calis() {

        System.out.println("Çalışan Çalışıyor...");

    }
    public void bilgileriGoster() {

        System.out.println("İsim : " + isim);
        System.out.println("Maaş : " + maas);
        System.out.println("Departman : " + departman);

    }
    public void departman_degistir(String yeni_departman) {
        this.departman = yeni_departman;

        System.out.println("Yeni Departman = " + yeni_departman);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }

    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
}
