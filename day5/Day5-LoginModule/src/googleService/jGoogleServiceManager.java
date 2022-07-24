package googleService;

public class jGoogleServiceManager {
    public void signInGoogle(String email){
        System.out.println("Sign in successfully google account. This account: " + email);
    }

    public void errorSignIn(String email){
        System.out.println("registration failed google account this: " + email);

    }
}
