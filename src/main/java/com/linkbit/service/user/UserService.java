package com.linkbit.service.user;

import com.linkbit.domain.user.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HuangBin on 2016/9/20.
 */
@Service
public interface UserService{
    List<User> findAll();
}
