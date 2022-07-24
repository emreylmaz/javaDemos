package core.concretes;

import core.abstracts.SignUpService;

public class SignUpServiceManager implements SignUpService {
    @Override
    public void signUp(String email) {
        System.out.println("Sign up success: " + email);
    }

    @Override
    public void signUpIsFail() {
        System.out.println("Sign up is failed.: ");


    }
}
