package com.liumq.springboottest1.mapper;

import com.liumq.springboottest1.entity.ClassInfo;

public interface ClassInfoMapper {

    int deleteByPrimaryKey(Integer autoid);

    int insert(ClassInfo record);

    int insertSelective(ClassInfo record);

    ClassInfo selectByPrimaryKey(Integer autoid);

    int updateByPrimaryKeySelective(ClassInfo record);

    int updateByPrimaryKey(ClassInfo record);
}