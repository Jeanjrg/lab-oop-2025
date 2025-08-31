
import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        String Tanggal = x.next();
        String keterangan = "";
        String[] tanggal = Tanggal.split("-");
        int hari = Integer.parseInt(tanggal[0]);
        keterangan += hari +" ";
        int bulan = Integer.parseInt(tanggal[1]);
        String[] Bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        keterangan += Bulan[bulan]+ " ";
        int tahun = Integer.parseInt(tanggal[2]);
        if(tahun<26){
            keterangan += (2000+tahun);
        }else{
            keterangan += (1900+tahun);
        }
        System.out.println(keterangan);
    }
}


