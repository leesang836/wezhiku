package com.wzk.website.test.entity;

import tk.mybatis.mapper.annotation.ColumnType;

import javax.persistence.*;

/**
 * com.wzk.website.test.entity
 *
 * @editor: crazy
 * @date: 2017-07-04
 * @time: 18:18
 * @company: crazy co.ltd
 * @description:
 */
@Entity
@Table(name = "t_zz_zk_web_demo")
public class DemoEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;//名称

    @Column(name = "code")
    private String code;//描述

    @Column(name = "describ")
    private String describ;//描述


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescrib() {
        return describ;
    }

    public void setDescrib(String describ) {
        this.describ = describ;
    }
}
