package cn.bdqn.service;

import cn.bdqn.dao.UserMapper;
import cn.bdqn.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    public UserMapper getUserMapper() {
        return userMapper;
    }

    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public List<User> find() {
        return userMapper.find();
    }

    @Override
    public void add(String username, String password) {
        userMapper.add(username,password);
    }

    @Override
    public User toUpdate(int id) {
        return userMapper.toUpdate(id);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(int id) {
        userMapper.delete(id);
    }
}
