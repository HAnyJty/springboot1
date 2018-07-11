package com.baizhi.entity;

import java.util.Date;

/**
 * Created by 惠 on 2018/7/4.
 */
public class Persons {
    private Integer id;
    private String name;
    private Date birthday;

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Persons() {
    }

    public Persons(Integer id,String name,Date birthday) {
        this.id=id;
        this.name=name;
        this.birthday = birthday;
    }
}
