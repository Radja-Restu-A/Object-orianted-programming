import java.util.ArrayList;
import java.util.List;

public class Family {
    private static List<Niece> nieces;
    private static List<Uncle> uncles;

    public Family() {
        this.nieces = new ArrayList<>();
        this.uncles = new ArrayList<>();
    }

    public boolean addNiece(String name, int day, int month) {
        if (findNiece(name) != null) {
            return false;
        }
        Niece newNiece = new Niece(name);
        nieces.add(newNiece);
        return true;
    }

    public boolean addUncle(String name) {
        if (findUncle(name) != null) {
            return false;
        }
        Uncle newUncle = new Uncle(name);
        uncles.add(newUncle);
        return true;
    }

    public Niece findNiece(String name) {
        for (Niece niece : nieces) {
            if (niece.getName().equalsIgnoreCase(name)) {
                return niece;
            }
        }
        return null;
    }

    public Uncle findUncle(String name) {
        for (Uncle uncle : uncles) {
            if (uncle.getName().equalsIgnoreCase(name)) {
                return uncle;
            }
        }
        return null;
    }

    public void listNieces() {
        System.out.println("List of Nieces:");
        for (Niece niece : nieces) {
            System.out.println(niece.getName());
        }
    }

    public void listUncles() {
        System.out.println("List of Uncles:");
        for (Uncle uncle : uncles) {
            System.out.println(uncle.getName());
        }
    }

    public static List<Uncle> getUncles() {
        return new ArrayList<>(uncles);
    }

    public static List<Niece> getNieces() {
        return new ArrayList<>(nieces);
    }
}
