import java.util.Map;
import java.util.HashMap;

public class Niece {
    private String name;
    private Map<Uncle, String> presents;

    // Constructor is private and should be called by Family.addNiece()
    protected Niece(String name) {
        this.name = name;
        this.presents = new HashMap<>();
    }

    // Method to clear all presents chosen for this niece
    public int clearPresents() {
        int removedCount = presents.size();
        presents.clear();
        return removedCount; // Return the number of presents removed
    }

    // Method to list all presents to be received by this niece
    public void listPresents() {
        System.out.println("Presents for " + name + ":");

        // List presents given by each uncle
        for (Map.Entry<Uncle, String> entry : presents.entrySet()) {
            System.out.println("From " + entry.getKey().getName() + ": " + entry.getValue());
        }

        // Listing uncles with no present for this niece
        for (Uncle uncle : Family.getUncles()) {
            if (!presents.containsKey(uncle)) {
                System.out.println("No present from " + uncle.getName());
            }
        }
    }

    // Method to add a present from a specific uncle
    protected void addPresent(Uncle uncle, String description) {
        presents.put(uncle, description);
    }

    public String getName() {
        return name;
    }
}
