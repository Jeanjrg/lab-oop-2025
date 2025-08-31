
import java.util.Scanner;

public class Soal4 {
    static int faktorial(int angka){
        if(angka==1){
            return 1;
        }
        return angka * faktorial(angka-1);
    }
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int angka = x.nextInt();
        System.out.println(faktorial(angka));
    }
}
