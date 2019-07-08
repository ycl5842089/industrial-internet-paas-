package cn.chinaunicom.industrialinternet.services.impl;


import cn.chinaunicom.industrialinternet.entitys.user.UserVO;
import cn.chinaunicom.industrialinternet.mappers.UserMapper;
import cn.chinaunicom.industrialinternet.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {
    @Autowired
    UserMapper userMapper;
    public List<UserVO> checkUser(UserVO userVO){
        return  userMapper.checkUser(userVO);
    }

    public List<UserVO> queryUserMessage(UserVO userVO){return userMapper.queryUserMessage(userVO); }

    public List<UserVO> queryUserCompanyName(){return userMapper.queryUserCompanyName(); }

}
