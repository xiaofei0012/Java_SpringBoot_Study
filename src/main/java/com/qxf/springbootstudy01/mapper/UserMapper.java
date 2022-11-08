package com.qxf.springbootstudy01.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.qxf.springbootstudy01.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @describe TODO
 * @Author Mr.Q
 * @Date 2022/11/4 15:56
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {


}
