package com.liumq.springboottest1.mapper;
import org.apache.ibatis.annotations.Mapper;
import com.liumq.springboottest1.entity.User;
@Mapper
public interface UserMapper {
	
    int insert(User record);
    
    int updateByUserName(User record);
    
    int selectByUserName(String name);
    
    User selectByUser(User user);
}