package cz.upce.fei.nnpia.cv02;

public class NewsApp implements INews {
    UserService userService;
    NotificationService notificationService;

    public NewsApp(UserService userService, NotificationService accountService) {
        this.userService = userService;
        this.notificationService = accountService;
    }

    public static void main(String[] args) {
        INews NewsApp = DependecyInjector.getBankApp();
        NewsApp.process();
    }

    @Override
    public void process() {
        userService.createUser();
        notificationService.allowNotifications();
    }
}
