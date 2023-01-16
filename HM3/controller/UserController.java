package HM3.controller;

import HM3.model.Repository;
import HM3.model.User;


public class UserController {
    private Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        this.repository.createUser(user);
    }
}
