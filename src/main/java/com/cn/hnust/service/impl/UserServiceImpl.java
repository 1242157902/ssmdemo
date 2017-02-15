package com.cn.hnust.service.impl;

import com.cn.hnust.dao.UserMapper;
import com.cn.hnust.pojo.User;
import com.cn.hnust.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * User：    ysl
 * Date:   2017/2/14
 * Time:   19:25
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    @Resource
    private UserMapper userDao;

    public User getUserById(int userId) {
        return this.userDao.selectByPrimaryKey(userId);
    }

}
