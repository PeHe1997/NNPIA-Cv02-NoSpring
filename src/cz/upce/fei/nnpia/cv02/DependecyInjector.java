package cz.upce.fei.nnpia.cv02;

public class DependecyInjector {
    private static UserService userService;
    private static NotificationService notificationService;
    private static EmailService emailService;

    private static EmailService getEmailService () {
        if (emailService == null) {
            emailService = new EmailService();
        }
        return emailService;
    }

    private static UserService getUserService() {
        if (userService == null) {
            userService = new UserService(getEmailService());
        }
        return userService;
    }

    private static NotificationService getNotificationService() {
        if (notificationService == null) {
            notificationService = new NotificationService(getEmailService());
        }
        return notificationService;
    }

    public static INews getBankApp() {
        return new NewsApp(getUserService(), getNotificationService());
    }
}
