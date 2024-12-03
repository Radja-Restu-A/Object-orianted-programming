public class SingletonExample {
    public static void main(String[] args) {
        // Try to create two instances of Singleton
        Singleton instance1 = Singleton.getInstance(0);
        Singleton instance2 = Singleton.getInstance(12);

        // Call a method on the Singleton instance
        instance1.showMessage();

        // Check if both instances are the same
        System.out.println("Are both instances the same? " + (instance1 == instance2));
        System.out.printf("\nHasil : " + instance2.showMessage());
    }
}
