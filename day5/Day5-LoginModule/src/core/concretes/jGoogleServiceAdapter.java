package core.concretes;

import core.abstracts.SignUpService;
import googleService.jGoogleServiceManager;

public class jGoogleServiceAdapter implements SignUpService {

    @Override
    public void signUp(String email) {
        jGoogleServiceManager service = new jGoogleServiceManager();
        service.signInGoogle(email);

    }

    @Override
    public void signUpIsFail(String email) {

        jGoogleServiceManager service = new jGoogleServiceManager();
        service.errorSignIn(email);

    }
}
