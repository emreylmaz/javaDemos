package repository.concretes;

import entities.concretes.User;
import repository.abstracts.RepositoryService;

import java.util.ArrayList;
import java.util.List;

public class UserRepository implements RepositoryService<User> {
    private List<User> users = new ArrayList<>();
    public UserRepository(){

    }
    @Override
    public List<User> getAll() {
        return users;
    }

    @Override
    public void add(User user) {
        users.add(user);
    }
}
