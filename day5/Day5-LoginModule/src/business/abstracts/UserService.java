package business.abstracts;

import entities.concretes.User;

public interface UserService {
    void signUp(User user);
    void update(User user);
    void delete(User user);
    boolean login(User user);
}
