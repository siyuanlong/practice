package com.mybatis.mapper;

import com.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface MapperTest {
    @Insert("insert into user(username,password) values(#{username},#{password})")
    void save(User user);
}
