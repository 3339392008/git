package com.lpy.serviceimpl;

import com.lpy.mapper.UserMapper;
import com.lpy.pojo.User;
import com.lpy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public String selectUser(String name,String pwd) {
        String show="账号错误！";
        User user=userMapper.selectUser(name);
        if(user!=null){
            if(user.getPwd().equals(pwd)){
                show="登陆成功";
            }else {
                show="密码错误！";
            }
        }
        return show;
    }
}
