package core.abstracts;

public interface EmailSendService {
    void sendVerifyEmail(String email);
    void isEmailActivated(String email);

}
