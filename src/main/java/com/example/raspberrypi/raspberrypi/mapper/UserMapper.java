package com.example.raspberrypi.raspberrypi.mapper;

import com.example.raspberrypi.raspberrypi.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    @Select("SELECT * FROM user where  username=#{u} and password=#{p}")
    User  queryuser(@Param("u") String username,@Param("p") String password);
    @Select("SELECT count(*) FROM user")
    int countid();
    @Delete("DELETE FROM user WHERE username = #{username}")
    boolean deleteuser(@Param("username") String name);
    @Insert("INSERT into user(id,username,password) VALUES (#{id},#{username},#{password})")
    boolean adduser(User user);

}
