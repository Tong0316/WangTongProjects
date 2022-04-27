package cn.bdqn.dao;

import cn.bdqn.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from User")
    List<User> find();
    @Insert("INSERT INTO USER(username,password) values(#{username},#{password})")
    void add(@Param("username") String username, @Param("password") String password);
    @Select("select * from User where id =#{id}")
    User toUpdate(int id);
    @Update("update User set username=#{username},password=#{password} where id=#{id}")
    void update(User user);
    @Delete("delete from User where id=#{id}")
    void delete(@Param("id") int id);
}
