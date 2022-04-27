package cn.bdqn.service;

import cn.bdqn.pojo.User;

import java.util.List;

public interface UserService {
    List<User> find();

    void add(String username, String password);

    User toUpdate(int id);

    void update(User user);

    void delete(int id);
}
