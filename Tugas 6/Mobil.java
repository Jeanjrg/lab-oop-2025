import java.util.Calendar;
import java.util.Date;

public class Mobil extends Kendaraan implements IBergerak, IServiceable {
    private int jumlahPintu;
    private double kapasitasMesin;
    private int jumlahKursi;
    private String bahanBakar;
    

    public Mobil(String merek, String model) {
        super(merek, model);
    }

    public int getJumlahPintu() {
        return jumlahPintu;
    }

    public void setJumlahPintu(int jumlah) {
        this.jumlahPintu = jumlah;
    }

    public double getKapasitasMesin() {
        return kapasitasMesin;
    }

    public void setKapasitasMesin(double kapasitas) {
        this.kapasitasMesin = kapasitas;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    public void setJumlahKursi(int jumlah) {
        this.jumlahKursi = jumlah;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public double hitungPajak() {
        return kapasitasMesin * 150000;
    }

    @Override
    public String getTipeKendaraan() {
        return ("Mobil bermerek " + merek + " dengan model "+ model);
    }

    @Override
    public boolean mulai() {
        kerusakan = true;
        berjalan = true;
        setKecepatan(40);
        return berjalan;
    }

    @Override
    public boolean berhenti() {
        berjalan = false;
        return berjalan;
    }

    @Override
    public double getKecepatan() {
        return kecepatan;
    }

    @Override
    public void setKecepatan(double kecepatan) {
        this.kecepatan = kecepatan;
    }

    @Override
    public boolean periksaKondisi() {
        return kerusakan;
    }
    @Override
    public void lakukanServis() {
        if (periksaKondisi()) {
            System.out.println("Mobil diservis");
            kerusakan = false;
        } else {
            System.out.println("Mobil belum terpakai");
        }
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 6);
        return cal.getTime();
    }

    @Override
    public double hitungBiayaServis() {
        return 500000;
    }
}
