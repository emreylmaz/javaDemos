import business.concretes.UserManager;
import core.concretes.EmailNotificationManager;
import core.concretes.SmsNotificationManager;
import entities.concretes.User;
import repository.concretes.UserRepository;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1,"Gökberk","Uğuz","abc@dfg.com","12345",new EmailNotificationManager());
        UserRepository userRepository = new UserRepository();
        UserManager userManager = new UserManager(userRepository);
        userManager.register(user1);


        User user2 = new User(2,"Melih Can","Çakıl","qwe@assd.com","123456",new SmsNotificationManager());
        userManager.register(user2);
        userManager.forgetPassword(user2);


        System.out.println(userRepository.getAll());
    }
}