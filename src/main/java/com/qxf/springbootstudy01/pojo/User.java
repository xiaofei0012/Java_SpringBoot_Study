package com.qxf.springbootstudy01.pojo;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/**
 * @describe TODO
 * @Author Mr.Q
 * @Date 2022/11/4 15:20
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    /**
    * 主键ID
    */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
    * 姓名
    */
    private String name;

    /**
    * 年龄
    */
    private Integer age;

    /**
    * 邮箱
    */
    private String email;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    private Integer version;


 }