import java.util.Calendar;
import java.util.Date;

public class Motor extends Kendaraan implements IBergerak, IServiceable {
    private String jenisMotor;
    private String tipeSuspensi;

    public Motor(String merek, String model) {
        super(merek, model);
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenis) {
        this.jenisMotor = jenis;
    }

    public double getKapasitasTangki() {
        return kapasitasTangki;
    }

    public void setKapasitasTangki(double kapasitas) {
        this.kapasitasTangki = kapasitas;
    }

    public String getTipeSuspensi() {
        return tipeSuspensi;
    }

    public void setTipeSuspensi(String tipe) {
        this.tipeSuspensi = tipe;
    }

    @Override
    public double hitungPajak() {
        return kapasitasTangki * 50000;
    }

    @Override
    public String getTipeKendaraan() {
        return ("Motor bermerek " + merek + " dengan model "+ model);
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
            System.out.println("Motor di servis");
            kerusakan = false;
        } else {
            System.out.println("Motor belum terpakai");
        }
    }

    @Override
    public Date getWaktuServisBerikutnya() {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, 3);
        return cal.getTime();
    }

    @Override
    public double hitungBiayaServis() {
        return 250000;
    }
}
