

public class Task2 {
    int ID = 0;
    String name;
    int stock;
    int price;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void displayInfo(){
        System.out.println(getName());
        System.out.println(getID());
        System.out.println(getStock());
        System.out.println(getPrice());
        System.out.println(availableStatus());
    }

    public String availableStatus(){
        return getStock() > 0 ? "Produk Tersedia" : "Produk Tidak Tersedia";
     }

    // public String isAvalaible(){
    //     return stock != 0 ? Available() : NotAvailable();
    // }

    public static void main(String[] args) {
        Task2 barang1 = new Task2();
        barang1.setID(001);
        barang1.setName("Buku");
        barang1.setStock(0);
        barang1.setPrice(5000);
        barang1.displayInfo();
        
    }
}
