package kz.iitu.lms.service;

import kz.iitu.lms.model.User;

import java.util.List;

public interface iUserService {
    User create(User o);
    User update(User o);
    void deleteUserById(Long id);
    User getById(Long id);
    List<User> getAll();
    List<User> getAllByName(String name);
    void createUser(User user);
    void updateUser(Long id, User user);

}
