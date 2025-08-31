import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Library {
    private List<LibraryItem> items;
    private List<Member> members;
    private LibraryLogger logger;

    public Library() {
        items = new ArrayList<>();
        members = new ArrayList<>();
        logger = new LibraryLogger();
    }

    public String addItem(LibraryItem item) {
        items.add(item);
        return item.getTitle() + " berhasil ditambahkan";
    }

    public LibraryItem findItemById(int itemId) {
        return items.stream()
                .filter(item -> item.getItemId() == itemId)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Item tidak ditemukan."));
    }

    public String getLibraryStatus() {
        StringBuilder sb = new StringBuilder();
        for (LibraryItem item : items) {
            sb.append(String.format("%-3d | %-6s | %-9s |\n", item.itemId, item.title, item.isBorrowed() ? "Dipinjam" : "Tersedia"));
        }
        return sb.toString();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public Member findMemberById(int memberId) {
        return members.stream()
                .filter(m -> m.getMemberId() == memberId)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Member tidak ditemukan."));
    }

    public LibraryLogger getLogger() {
        return logger;
    }

    public String getAllLogs() {
        return logger.getLogs();
    }
}
