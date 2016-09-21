package com.linkbit.service.user;

import com.linkbit.dao.UserDao;
import com.linkbit.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by HuangBin on 2016/9/20.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    /**
     * @param user
     * @return 返回保存的用户对象
     */
    public User save(User user) {

        user = userDao.save(user);
        return user;
    }


    public List<User> findAll() {
        Iterable<User> userIterable = userDao.findAll();
        List<User> userList = new ArrayList<User>();
        Iterator<User> userIterator = userIterable.iterator();
        while (userIterator.hasNext()) {
            userList.add(userIterator.next());
        }
        return userList;
    }


    /**
     * @param id 用户id
     * @return 根据用户id删除
     */
    public boolean delete(Long id) {

        boolean result = false;

        if (id != null) {
            userDao.delete(id);
            result = (userDao.findOne(id) == null);
        }

        return result;
    }
}
