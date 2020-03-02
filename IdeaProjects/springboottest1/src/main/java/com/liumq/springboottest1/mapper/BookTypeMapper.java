package com.liumq.springboottest1.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.liumq.springboottest1.entity.BookType;


@Mapper
public interface BookTypeMapper {
	
    public List<BookType> selectAllBookType();
}