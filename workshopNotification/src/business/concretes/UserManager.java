package business.concretes;

import business.abstracts.UserServices;
import entities.concretes.User;
import repository.abstracts.RepositoryService;

public class UserManager implements UserServices {
    //private NotificationService notificationService;
    private final RepositoryService repositoryService;

    public UserManager(RepositoryService repositoryService) {
        this.repositoryService = repositoryService;
    }


    @Override
    public void register(User user) {
        repositoryService.add(user);
        user.getNotificationService().sendRegisterNotification(user);
    }

    @Override
    public void forgetPassword(User user) {
        user.getNotificationService().sendForgetPasswordNotification(user);
    }
}
