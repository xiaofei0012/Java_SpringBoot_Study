package com.qxf.springbootstudy01.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qxf.springbootstudy01.mapper.UserMapper;
import com.qxf.springbootstudy01.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * @describe TODO
 * @Author Mr.Q
 * @Date 2022/11/4 15:55
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {

    @Autowired
    UserMapper userMapper;





}
