// Layanan Email (Dependency)
class EmailService {
    public void sendEmail(String message, String recipient) {
        System.out.println("Email sent to " + recipient + " with message: " + message);
    }
}

// Kelas Notifikasi yang bergantung pada EmailService (Dependency Injection)
class NotificationService {
    private EmailService emailService; // Dependency

    // Dependency Injection melalui konstruktor
    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendNotification(String message, String recipient) {
        // Menggunakan EmailService untuk mengirim email
        emailService.sendEmail(message, recipient);
    }
}

// Program Utama
public class Main {
    public static void main(String[] args) {
        // Membuat dependency (EmailService)
        EmailService emailService = new EmailService();

        // Injecting dependency ke NotificationService
        NotificationService notificationService = new NotificationService(emailService);

        // Mengirim notifikasi
        notificationService.sendNotification("Hello, this is a test notification!", "user@example.com");
    }
}
