public class Item {
    // kavramları tanımladığım yer
    protected String urunAdi;
    public String tedarikciAdi;
    protected double satisFiyati;
    private double alisFiyati;

    // Constructorları oluşturduğum yer
    public Item(String urunAdi, String tedarikciAdi, double satisFiyati, double alisFiyati){
        this.urunAdi=urunAdi;
        this.tedarikciAdi=tedarikciAdi;
        this.satisFiyati=satisFiyati;
        this.alisFiyati=alisFiyati;

    }
    // setter metotlarını oluşturduğum yer
    public String getUrunAdi(){
        return urunAdi;
    }

   public void setUrunAdi(String urunAdi){
        this.urunAdi=urunAdi;
   }

   public String gettedarikciAdi(){
      return tedarikciAdi = "Asus";
   }

   public double getSatisFiyati(){
        return satisFiyati;
   }

   public void setSatisFiyati(double satisFiyati){
        this.satisFiyati=satisFiyati;
   }

   public double getAlisFiyati(){
        return alisFiyati;
   }

   public void setAlisFiyati(double alisFiyati){
        this.alisFiyati=alisFiyati;
   }

   // satıs fiyatını %20 arttıran yer
   public void satisFiyatiniArttir(){
        double yeniSatisFiyati = this.satisFiyati * 1.20;
        this.setSatisFiyati(yeniSatisFiyati);
   }
   // kar hesapladığım yer
   public double karHesapla(){

        return this.satisFiyati - this.alisFiyati;
   }
}
