
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Masukkan Judul Film :");
        System.out.print("> ");
        String Judul = x.nextLine().toLowerCase();
        String[] judul = Judul.split(" ");
        String hasil = "";
        for (int i = 0;i<judul.length; i++){
            if(!judul[i].isEmpty()){
                judul[i] = judul[i].substring(0,1).toUpperCase()+judul[i].substring(1);
                hasil += judul[i] + " ";
            }
           
        
        }
        System.out.println(hasil);
    }
}
