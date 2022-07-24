import business.concretes.UserManager;
import core.abstracts.EmailSendService;
import core.concretes.EmailSendManager;
import core.concretes.SignUpServiceManager;

import core.concretes.jGoogleServiceAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1);
        user1.setFirstName("Emre");
        user1.setLastName("Yilmaz");
        user1.setEmail("emre.ylmz09@gmail.com");
        user1.setPassword("123456789");


        UserManager userManager = new UserManager(new EmailSendManager(),new SignUpServiceManager(),new HibernateUserDao());
        userManager.signUp(user1);
        userManager.login(user1);
    }
}