import java.util.*;

public class Uncle {
    private String nama;
    private Map<String, Niece> presents;

    public Uncle(String nama) {
        this.nama = nama;
        this.presents = new HashMap<>();
    }

    String getName(){
        return nama;
    }

    public boolean addPresent(Niece recipient, String description) {
        // Memastikan keponakan tidak menerima hadiah yang sama dari paman ini
        if (!presents.containsKey(description)) {
            presents.put(description, recipient);
            return true;
        }
        return false;
    }

    public void listPresents() {
        System.out.println("Presents from Uncle " + nama + ":");

        // Menampilkan hadiah yang sudah diberikan dan penerimanya
        for (Map.Entry<String, Niece> entry : presents.entrySet()) {
            System.out.println("Present: " + entry.getKey() + ", Recipient: " + entry.getValue().getName());
        }

        // Menampilkan keponakan yang belum menerima hadiah dari paman ini
        for (Niece niece : Family.getNieces()) {
            if (!presents.containsValue(niece)) {
                System.out.println("No present for: " + niece.getName());
            }
        }
    }
}
