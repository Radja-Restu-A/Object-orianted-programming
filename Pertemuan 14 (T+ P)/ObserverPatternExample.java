import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(String message);
}

// Concrete Observer
class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }

    @Override
    public String toString() {
        return "User{name='" + name + "'}";
    }
}

// Subject
class NotificationService {
    private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyAllObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public List<Observer> getObservers() {
        return observers;
    }
}

// Main program
public class ObserverPatternExample {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();

        Observer user1 = new User("Alice");
        Observer user2 = new User("Bob");

        service.subscribe(user1);
        service.subscribe(user2);

        // Print the list of observers
        System.out.println("Current Observers: " + service.getObservers());

        service.notifyAllObservers("New Notification!");

        service.unsubscribe(user1);

        // Print the updated list of observers
        System.out.println("Updated Observers: " + service.getObservers());

        service.notifyAllObservers("New Notification!");
    }
}
