package business.abstracts;

import entities.concretes.User;

public interface UserServices {
    void register(User user);
    void forgetPassword(User user);
}
