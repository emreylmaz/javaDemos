package core.abstracts;

import entities.concretes.User;

public interface VerificationService {
    boolean emailVerification(User user);
    boolean passwordVerification(User user);
    boolean nameVerification(User user);

}
