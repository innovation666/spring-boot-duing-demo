package com.duing.bean;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 实体类-->代表嘉宾
 *
 * @AllArgsConstructor--->生成带参数的构造方法
 */

@Data @AllArgsConstructor
public class Guest {

    private String name;

    private String role;

}
