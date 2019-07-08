package cn.chinaunicom.industrialinternet.mappers;


import cn.chinaunicom.industrialinternet.entitys.user.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<UserVO> checkUser(UserVO userVO);

    public List<UserVO> queryUserMessage(UserVO userVO);

    public List<UserVO> queryUserCompanyName();
}
