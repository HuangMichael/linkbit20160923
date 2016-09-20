package com.linkbit.dao;

import com.linkbit.domain.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by HuangBin on 2016/9/20.
 */
@Repository
public interface UserDao extends CrudRepository<User, Long> {


}
