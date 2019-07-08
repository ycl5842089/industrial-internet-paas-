package cn.chinaunicom.industrialinternet.services;

import cn.chinaunicom.industrialinternet.entitys.user.UserVO;

import java.util.List;

public interface IUserService {
    public List<UserVO> checkUser(UserVO userVO);

    public List<UserVO> queryUserMessage(UserVO userVO);

    public List<UserVO> queryUserCompanyName();
}
