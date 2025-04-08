public class Taskk4 {
    public static void main(String[] args) {
        Alamat alamat = new Alamat();
        alamat.jalan = "Tamalarea Indah";
        alamat.kota = "Makassar";

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.alamat = alamat;
        mahasiswa.nama = "Jean Patra Paeloran";
        mahasiswa.nim = "H071241060";

        System.out.println("Nama\t: " + mahasiswa.getNama());
        System.out.println("Nim\t: " + mahasiswa.getNim());
        System.out.println("Alamat\t: " + mahasiswa.getAlamat());
    }
}

class Alamat {
    String jalan;
    String kota;

    public String string() {
        return jalan + ", " + kota;
    }
    
}

class Mahasiswa {
    String nama;
    String nim;
    Alamat alamat;

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat.string();
    }
}
