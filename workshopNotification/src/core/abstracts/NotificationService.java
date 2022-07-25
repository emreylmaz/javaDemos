package core.abstracts;

import entities.concretes.User;

public interface NotificationService {
    void sendRegisterNotification(User user);
    void sendForgetPasswordNotification(User user);
}
