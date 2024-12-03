// Singleton class
public class Singleton {
    // Private static variable to hold the single instance
    private static Singleton instance;
    private static Integer test;

    // Private constructor to prevent instantiation
    private Singleton(Integer test) {
        System.out.println("Singleton instance created!");
        this.test = test;
    }

    // Public method to provide access to the instance
    public static Singleton getInstance(Integer test) {
        if (instance == null) {
            instance = new Singleton(test); // Create instance if it doesn't exist
        }
        return instance;
    }

    // Example method
    public Integer showMessage() {
        System.out.println("Hello from Singleton!");
        return (test);
    }

}