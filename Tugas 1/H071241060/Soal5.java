
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = x.next();
        if(password.length()>8){
            boolean Kapital = false;
            boolean Kecil = false;
            boolean angka = false;
        
            for (char c : password.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    Kapital = true;
                } else if (Character.isLowerCase(c)) {
                    Kecil = true;
                } else if (Character.isDigit(c)) {
                    angka = true;
                }
            }
            if(Kapital && Kecil && angka){
                System.out.println("Password valid");
            }else{
                System.out.println("Password invalid");
            }
        }else{
            System.out.println("Password invalid");
        }
    }
}
