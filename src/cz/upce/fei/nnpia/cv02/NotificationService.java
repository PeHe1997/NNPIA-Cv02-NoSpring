package cz.upce.fei.nnpia.cv02;

public class NotificationService {
    EmailService emailService;

    public NotificationService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void allowNotifications() {
        emailService.sendEmail("st55190@upce.cz","Notification were allowed");
    }
}
