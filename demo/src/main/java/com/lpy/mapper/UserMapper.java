package com.lpy.mapper;

import com.lpy.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    User selectUser(@Param("name") String name);
}
