package business.concretes;

import business.abstracts.UserService;
import core.abstracts.EmailSendService;
import core.abstracts.SignUpService;
import core.concretes.EmailSendManager;
import core.concretes.SignUpServiceManager;
import core.concretes.jGoogleServiceAdapter;
import dataAccess.abstracts.UserDao;
import dataAccess.concretes.HibernateUserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserManager implements UserService {
    List<String> emailList=new ArrayList<String>();

    private EmailSendService emailSendService;
    private SignUpServiceManager signUpService;
    private UserDao userDao;
    private jGoogleServiceAdapter jgoogleServiceAdapter;

    public UserManager(EmailSendService emailSendService, SignUpServiceManager signUpService, UserDao userDao) {
        this.emailSendService = emailSendService;
        this.signUpService = signUpService;
        this.userDao = userDao;


    }

    public UserManager() {

    }




    @Override
    public void signUp(User user) {
        if(emailVerification(user) && passwordVerification(user) && !nameVerification(user))
        {
            emailList.add(user.getEmail());
            this.emailSendService.sendVerifyEmail(user.getEmail());
            this.emailSendService.isEmailActivated(user.getEmail());
            this.signUpService.signUp(user.getEmail());
            this.userDao.add(user);
        }
        else
        {
            this.signUpService.signUpIsFail();
        }


    }

    @Override
    public void update(User user) {
        userDao.update(user);
        System.out.println("Account updated: " + user.getEmail());

    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
        System.out.println("Account deleted: " + user.getEmail());

    }

    @Override
    public boolean login(User user) {
        if (emailVerification(user)){
            System.out.println("Login success");
            return true;
        }else {
            System.out.println("Login fail"+ user.getEmail());
            return false;
        }
    }

    private boolean emailVerification(User user) {
        final Pattern emailRegex = Pattern.compile("[a-z0-9!#$%&'+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'+/=?^_`{|}~-]+)@(?:[a-z0-9](?:[a-z0-9-][a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
        if (emailRegex.matcher((CharSequence) user.getEmail()).matches()) {
            return true;
        }
        return false;
    }

    private boolean passwordVerification(User user) {
        String regex = "[0-9a-zA-Z]{6,}";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(user.getPassword());
        if(matcher.matches()==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    private boolean nameVerification(User user) {
        String regex = "[0-9a-zA-Z]{6,}";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(user.getFirstName());
        Matcher matcherLastName = pattern.matcher(user.getLastName());
        if(matcher.matches()==true && matcherLastName.matches()==true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
