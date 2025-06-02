import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Sistem Manajemen Perpustakaan ===");
            System.out.println("1. Tambah Item");
            System.out.println("2. Tambah Anggota");
            System.out.println("3. Pinjam Item");
            System.out.println("4. Kembalikan Item");
            System.out.println("5. Lihat Status Perpustakaan");
            System.out.println("6. Lihat Log Aktivitas");
            System.out.println("7. Lihat Item yang Dipinjam Anggota");
            System.out.println("8. Keluar");
            System.out.print("Pilih opsi: ");
            int choice = input.nextInt();

            try {
                switch (choice) {
                    case 1 -> {
                        input.nextLine();
                        System.out.print("Judul item: ");
                        String title = input.nextLine();
                        System.out.print("ID item: ");
                        int id = input.nextInt();
                        input.nextLine();
                        System.out.print("Tipe (buku/dvd): ");
                        String type = input.nextLine();

                        if (type.equalsIgnoreCase("buku")) {
                            System.out.print("Author: ");
                            String author = input.nextLine();
                            Book book = new Book(title, id, author);
                            System.out.println(library.addItem(book));
                        } else if (type.equalsIgnoreCase("dvd")) {
                            System.out.print("Durasi (menit): ");
                            int duration = input.nextInt();
                            DVD dvd = new DVD(title, id, duration);
                            System.out.println(library.addItem(dvd));
                        } else {
                            System.out.println("Tipe item tidak dikenali.");
                        }
                    }
                    case 2 -> {
                        input.nextLine();
                        System.out.print("Nama anggota: ");
                        String name = input.nextLine();
                        System.out.print("ID anggota: ");
                        int memberId = input.nextInt();
                        Member member = new Member(name, memberId);
                        library.addMember(member);
                        System.out.println("Anggota berhasil ditambahkan.");
                    }
                    case 3 -> {
                        System.out.print("ID anggota: ");
                        int memberId = input.nextInt();
                        Member member = library.findMemberById(memberId);
                        System.out.print("ID item: ");
                        int itemId = input.nextInt();
                        LibraryItem item = library.findItemById(itemId);
                        System.out.print("Berapa hari pinjam: ");
                        int days = input.nextInt();
                        String result = member.borrow(item, days);
                        System.out.println(result);
                        library.getLogger().logActivity(item.getTitle() + " dipinjam oleh " + member.getName());
                    }
                    case 4 -> {
                        System.out.print("ID anggota: ");
                        int memberId = input.nextInt();
                        Member member = library.findMemberById(memberId);
                        System.out.print("ID item: ");
                        int itemId = input.nextInt();
                        LibraryItem item = library.findItemById(itemId);
                        System.out.print("Berapa hari terlambat: ");
                        int late = input.nextInt();
                        String result = member.returnItem(item, late);
                        System.out.println(result);
                        library.getLogger().logActivity(item.getTitle() + " dikembalikan oleh " + member.getName());
                    }
                    case 5 -> {
                        System.out.println("+----------+---------------------+-----------+");
                        System.out.println("| ID Item  | Judul               | Status    |");
                        System.out.println("+----------+---------------------+-----------+");
                        System.out.println(library.getLibraryStatus());
                        System.out.println("+----------+---------------------+-----------+");
                    }
                    case 6 -> System.out.println(library.getAllLogs());
                    case 7 -> {
                        System.out.println("Masukkan id anggota : ");
                        int memberId = input.nextInt();
                        Member member = library.findMemberById(memberId);
                        member.getBorrowedItems();
                    }
                    case 8 -> System.exit(0);
                    default -> System.out.println("Menu tidak valid.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
