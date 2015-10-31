package com.yixiao.mapper;

import com.yixiao.domain.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/*
定义SQL映射的接口，使用注解指明方法要执行的SQL
我们不需要针对此接口实现具体的类，这个具体的实现类由MyBatis帮我们动态构建出来，直接拿来用即可
 */
public interface UserMapper {
    //使用@Insert注解指明add方法要执行的SQL
    @Insert("insert into users(name,age) values(#{name}, #{age})")
    public int add(User user);

    //使用@Delete注解指明deleteById方法要执行的SQL
    @Delete("delete from users where id=#{id}")
    public int deleteById(int id);

    //使用@Update注解指明update方法要执行的SQL
    @Update("update users set name=#{name},age=#{age} where id=#{id}")
    public int update(User user);

    //使用@Select注解指明getById方法要执行的SQL
    @Select("select * from users where id=#{id}")
    public User getById(int id);

    //使用@Select注解指明getAll方法要执行的SQL
    @Select("select * from users")
    public List<User> getAll();
}
