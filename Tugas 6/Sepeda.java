import java.util.Calendar;
import java.util.Date;

public class Sepeda extends Kendaraan implements IBergerak, IServiceable {
    private String jenisSepeda;
    private int jumlahGear;
    private int ukuranRoda;

    public Sepeda(String merek, String model) {
        super(merek, model);
    }

    public String getJenisSepeda() {
        return jenisSepeda;
    }

    public void setJenisSepeda(String jenis) {
        this.jenisSepeda = jenis;
    }

    public int getJumlahGear() {
        return jumlahGear;
    }

    public void setJumlahGear(int jumlah) {
        this.jumlahGear = jumlah;
    }

    public int getUkuranRoda() {
        return ukuranRoda;
    }

    public void setUkuranRoda(int ukuran) {
        this.ukuranRoda = ukuran;
    }

    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public String getTipeKendaraan() {
        return ("Sepeda bermerek " + merek + " dengan model " + model);
    }

    @Override
    public boolean mulai() {
        kerusakan = true;
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
            System.out.println("Sepeda di servis");
        } else {
            System.out.println("Sepeda belum terpakai");
        }
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 1);
        return cal.getTime();
    }

    @Override
    public double hitungBiayaServis() {
        return 100000;
    }
}
