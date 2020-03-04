package com.liumq.springboottest1.mapper;

import com.liumq.springboottest1.entity.ClassInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassInfoMapper {

   int insert (ClassInfo record);

   List<ClassInfo> selectAll();

   List<ClassInfo> selectByClassName(String className);

   int deleteByClassName(String className);

   void updateClassInfoByClassName (ClassInfo record);

}