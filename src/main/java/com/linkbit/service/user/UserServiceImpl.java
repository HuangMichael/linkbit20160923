package com.linkbit.service.user;

import com.linkbit.dao.UserDao;
import com.linkbit.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HuangBin on 2016/9/20.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public User save(User user) {

        user.setId(1l);
        user.setUserName("linkbiter");
        user.setPassword("xxxxxxxx");
        user.setStatus("1");
        return user;
    }


    public List<User> findAll() {
        Iterable<User> userIterable = userDao.findAll();
        List<User> userList = new ArrayList<User>();
        while (userIterable.iterator().hasNext()) {
            userList.add(userIterable.iterator().next());
        }
        return userList;
    }
}
