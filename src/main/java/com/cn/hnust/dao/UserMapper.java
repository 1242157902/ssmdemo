package com.cn.hnust.dao;

import com.cn.hnust.pojo.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * User：    ysl
 * Date:   2017/2/14
 * Time:   21:47
 */
@Repository
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}
