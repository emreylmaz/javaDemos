package core.concretes;

import core.abstracts.VerificationService;
import entities.concretes.User;

public class VerificationManager implements VerificationService {
    @Override
    public boolean emailVerification(User user) {
        return true;
    }

    @Override
    public boolean passwordVerification(User user) {
        return true;
    }

    @Override
    public boolean nameVerification(User user) {
        return true;
    }
}
