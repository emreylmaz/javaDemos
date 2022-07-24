package core.concretes;

import core.abstracts.SignUpService;
import googleService.jGoogleServiceManager;

public class jGoogleServiceAdapter implements SignUpService {

    @Override
    public void signUp(String email) {
        jGoogleServiceManager service = new jGoogleServiceManager();
        service.signInGoogle();

    }

    @Override
    public void signUpIsFail() {

        jGoogleServiceManager service = new jGoogleServiceManager();
        service.errorSignIn();

    }
}
