import java.util.ArrayList;

public class ShoppingCart {
    // Sepetimizin listesini oluşturduğumuz yer
    private ArrayList<Item> sepet;

    // Yapıcı metotları tekrardan yazdığımız yer
    public ShoppingCart() {
        this.sepet = new ArrayList<>();
    }

    // Sepete ürün eklediğimiz yer
    public void sepeteEkle(Item item) {
        this.sepet.add(item);
    }

    // Sepettekilerin toplam fiyatını belirleyen kısım
    public double toplamFiyatHesapla() {
        double toplamFiyat = 0;
        for (Item item : sepet) {
            toplamFiyat += item.getSatisFiyati();
        }
        return toplamFiyat;
    }

    // Sepetteki ürünlerin bilgilerini yazdırdığımız kısım
    public void sepetiGoster() {
        for (Item item : sepet) {
            System.out.println("Ürün Adı: " + item.getUrunAdi());
            System.out.println("Tedarikçi Adı: " + item.gettedarikciAdi());
            System.out.println("Satış Fiyatı: " + item.getSatisFiyati());
            System.out.println("Alış Fiyatı: " + item.getAlisFiyati());
            System.out.println("Kar: " + item.karHesapla());
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {
        ShoppingCart sepet = new ShoppingCart();
        Item item1 = new Item("Asus Tuf Gaming", "Asus", 16000, 24000);
        Item item2 = new Item("Samsung S24", "Samsung", 24000, 35000);

        // Sepete Eklediğimiz yer
        sepet.sepeteEkle(item1);
        sepet.sepeteEkle(item2);

        // Satış fiyatlarını % 20 arttırmak
        item1.satisFiyatiniArttir();
        item2.satisFiyatiniArttir();

        // Sepeti Gösterdiğimiz kodlar
        sepet.sepetiGoster();

        // Toplam fiyatlarını gösterdiğimiz kısım
        double toplamFiyat = sepet.toplamFiyatHesapla();
        System.out.println("Sepetteki Ürünlerin Toplam Fiyatı: " + toplamFiyat);
    }
}
