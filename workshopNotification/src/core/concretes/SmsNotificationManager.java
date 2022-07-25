package core.concretes;

import core.abstracts.NotificationService;
import entities.concretes.User;

public class SmsNotificationManager implements NotificationService {
    @Override
    public void sendRegisterNotification(User user) {
        System.out.println("Sms Register Notification has been sent to: "+ user.getFirstName());
    }

    @Override
    public void sendForgetPasswordNotification(User user) {
        System.out.println("Sms Notification has been sent to: "+user.getFirstName());
    }
}
