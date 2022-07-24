package core.concretes;

import core.abstracts.EmailSendService;

public class EmailSendManager implements EmailSendService {
    @Override
    public void sendVerifyEmail(String email) {
        System.out.println("Email activation mail send. This email: " + email);
    }

    @Override
    public void isEmailActivated(String email) {
        System.out.println("Email activated. This email: " + email);

    }

}
