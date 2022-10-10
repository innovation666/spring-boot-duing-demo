package com.duing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * 实体类-->代表嘉宾
 *
 * @AllArgsConstructor--->生成带参数的构造方法
 */
@Entity(name = "jpa")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guest implements Serializable {
    @Id
    private Long jid;
    @Column
    private String jname;
    @Column
    private String jrole;

}
