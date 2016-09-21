package com.linkbit.service.user;

import com.linkbit.domain.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HuangBin on 2016/9/20.
 */
@Service
public interface UserService {
    /**
     * @return 返回所有的用户信息
     */
    List<User> findAll();


    /**
     * @param id 用户id
     * @return 删除用户信息
     */
    boolean delete(Long id);


    /**
     * @param user
     * @return 保存用户信息
     */
    User save(User user);
}
