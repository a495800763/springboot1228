package com.liumq.springboottest1.mapper;

import com.liumq.springboottest1.entity.ClassBookRelation;
import com.liumq.springboottest1.entity.ClassBookRelationKey;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassBookRelationMapper {

     List<ClassBookRelation> selectAll ();
}