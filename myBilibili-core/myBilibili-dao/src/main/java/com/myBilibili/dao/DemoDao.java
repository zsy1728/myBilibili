package com.myBilibili.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DemoDao {

    public String query(Long id);
}
