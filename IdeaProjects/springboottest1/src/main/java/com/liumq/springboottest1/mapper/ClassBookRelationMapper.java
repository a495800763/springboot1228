package com.liumq.springboottest1.mapper;

import com.liumq.springboottest1.entity.ClassBookRelation;
import com.liumq.springboottest1.entity.ClassBookRelationKey;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ClassBookRelationMapper {

    int deleteByPrimaryKey(ClassBookRelationKey key);

    int insert(ClassBookRelation record);

    int insertSelective(ClassBookRelation record);

    ClassBookRelation selectByPrimaryKey(ClassBookRelationKey key);

    int updateByPrimaryKeySelective(ClassBookRelation record);

    int updateByPrimaryKey(ClassBookRelation record);
}