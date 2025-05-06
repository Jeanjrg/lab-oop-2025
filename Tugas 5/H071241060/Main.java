import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hero karakter = null;

        System.out.println("=== Pilih Karakter ===");
        System.out.println("1. Archer");
        System.out.println("2. Wizard");
        System.out.println("3. Fighter");
        System.out.print("> ");
        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1 -> karakter = new Archer("Pemanah", 100, 15);
            case 2 -> karakter = new Wizard("Penyihir", 90, 20);
            case 3 -> karakter = new Fighter();
            default -> {
                System.out.println("Pilihan tidak tersedia");
                System.exit(0);
            }
        }

        int menu;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Serang");
            System.out.println("2. Keluar");
            System.out.print("> ");
            menu = sc.nextInt();

            switch (menu) {
                case 1 -> karakter.serang();
                case 2 -> System.out.println("Game Selesai!");
                default -> System.out.println("Menu tidak tersedia.");
            }

        } while (menu != 2);

        sc.close();
    }
}