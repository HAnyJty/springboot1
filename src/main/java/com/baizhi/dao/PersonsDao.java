package com.baizhi.dao;

import com.baizhi.entity.Persons;

import java.util.List;

/**
 * Created by 惠 on 2018/7/4.
 */
public interface PersonsDao {
    public List<Persons> queryAll();
}
