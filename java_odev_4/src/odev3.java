public class odev3 {
    // Dikdörtgenin kenarlarını tanımladığım yer
    int uzunKenar;
    int kisaKenar;

    // metotlarımı ve fonksiyonları yazdığım yer

    public odev3(int uzunKenar, int kisaKenar){
        this.uzunKenar = uzunKenar;
        this.kisaKenar = kisaKenar;
    }

    // alanı hesapladığım kodların olduğu kısım
    public int alanHesapla(){
        return uzunKenar * kisaKenar;
    }

    // çevre hesapladığım kodların olduğu kısım
    public int cevreHesapla(){
        return 2 * (uzunKenar + kisaKenar);
    }

    // kodların gövde kısmı (test kısmı)
    public static void main(String[] args) {
        // nesne oluşturduğum yer
        odev3 odev3 = new odev3(5, 3);

        // çevre ve alan hesaplarını yazdırdığımız kısım
        System.out.println("Dikdörtgenin Alanı: " + odev3.alanHesapla());
        System.out.println("Dikdörtgenin Çevresi: " + odev3.cevreHesapla());
    }
}
