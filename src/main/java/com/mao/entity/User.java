package com.mao.entity;

import lombok.Data;

@Data
public class User {
//    @TableId(type=IdType.Auto)
    private Integer id;
    private String name;
    private String pwd;

}
