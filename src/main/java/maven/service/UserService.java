package maven.service;

import maven.pojo.Info;
import maven.pojo.User;

import java.util.List;

public interface UserService {
    void register(User user);
    User loginCheck(User user);
    User selectById(int id);

    List<User> permission();

    void failUser(int id);
    void passUser(int id);
}
