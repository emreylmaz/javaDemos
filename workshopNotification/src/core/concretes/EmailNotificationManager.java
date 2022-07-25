package core.concretes;

import core.abstracts.NotificationService;
import entities.concretes.User;

public class EmailNotificationManager implements NotificationService {
    @Override
    public void sendRegisterNotification(User user) {
        System.out.println("Email Register Notification has been sent to: "+user.getFirstName());
    }

    @Override
    public void sendForgetPasswordNotification(User user) {
        System.out.println("Email Notification has been sent to"+user.getFirstName());
    }
}
