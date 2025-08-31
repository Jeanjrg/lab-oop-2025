import java.util.Calendar;
import java.util.Date;

public class Traktor extends Kendaraan implements IBergerak, IServiceable {
    private String jenisTraktor;
    private int dayaMesin;
    private int jumlahRoda;
    private String bahanBakar;


    public Traktor(String merek, String model) {
        super(merek, model);
    }

    // Getter dan Setter
    public String getJenisTraktor() {
        return jenisTraktor;
    }

    public void setJenisTraktor(String jenisTraktor) {
        this.jenisTraktor = jenisTraktor;
    }

    public int getDayaMesin() {
        return dayaMesin;
    }

    public void setDayaMesin(int dayaMesin) {
        this.dayaMesin = dayaMesin;
    }

    public int getJumlahRoda() {
        return jumlahRoda;
    }

    public void setJumlahRoda(int jumlahRoda) {
        this.jumlahRoda = jumlahRoda;
    }

    public double getKapasitasTangki() {
        return kapasitasTangki;
    }

    public void setKapasitasTangki(double kapasitasTangki) {
        this.kapasitasTangki = kapasitasTangki;
    }

    public String getBahanBakar() {
        return bahanBakar;
    }

    public void setBahanBakar(String bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    @Override
    public double hitungPajak() {
        // Bisa disesuaikan, misal berdasarkan daya mesin
        return dayaMesin * 1500;
    }

    @Override
    public String getTipeKendaraan() {
        return "Traktor bermerek " + merek + " dengan model " + model;
    }

    @Override
    public boolean mulai() {
        kerusakan = true; // Simulasi kerusakan awal
        berjalan = true;
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
            System.out.println("Traktor di servis");
        } else {
            System.out.println("Traktor belum dipakai");
        }
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 3); // Servis tiap 3 bulan
        return cal.getTime();
    }

    @Override
    public double hitungBiayaServis() {
        return 500000; // Biaya lebih mahal dari sepeda
    }
}

