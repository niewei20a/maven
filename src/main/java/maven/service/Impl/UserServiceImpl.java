package maven.service.Impl;

import maven.dao.InfoMapper;
import maven.dao.UserMapper;
import maven.pojo.Info;
import maven.pojo.User;
import maven.service.UserService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    InfoMapper infoMapper;
    @Override
    public void register(User user) {
       user.setPermission(0);
       System.out.println(user);
       userMapper.insert(user);
    }

    @Override
    public User loginCheck(User user) {
        return userMapper.loginCheck(user);
    }

    @Override
    public User selectById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> permission() {
        return userMapper.selectPermission();
    }

    @Override
    public void failUser(int id) {
        userMapper.failUser(id);
    }

    @Override
    public void passUser(int id) {
        userMapper.passUser(id);
    }

}
