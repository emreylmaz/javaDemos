package business.concretes;

import business.abstracts.UserService;
import core.abstracts.EmailSendService;
import core.abstracts.SignUpService;
import core.abstracts.VerificationService;
import core.concretes.SignUpServiceManager;
import core.concretes.VerificationManager;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements UserService {
    List<String> emailList=new ArrayList<String>();

    private EmailSendService emailSendService;
    private SignUpServiceManager signUpService;
    private UserDao userDao;
    private VerificationManager verificationManager;

    public UserManager(EmailSendService emailSendService, SignUpServiceManager signUpService, UserDao userDao, VerificationManager verificationManager) {
        this.emailSendService = emailSendService;
        this.signUpService = signUpService;
        this.userDao = userDao;
        this.verificationManager = verificationManager;
    }

    @Override
    public void signUp(User user) {
        if(verificationManager.emailVerification(user) && verificationManager.passwordVerification(user) && verificationManager.nameVerification(user))
        {
            emailList.add(user.getEmail());
            this.emailSendService.sendVerifyEmail(user.getEmail());
            this.emailSendService.isEmailActivated(user.getEmail());
            this.signUpService.signUp(user.getEmail());
            this.userDao.add(user);
        }
        else
        {
            this.signUpService.signUpIsFail(user.getEmail());
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
        if (!verificationManager.emailVerification(user)){
            System.out.println("Login success");
            return true;
        }else {
            System.out.println("Login fail"+ user.getEmail());
            return false;
        }
    }
}
