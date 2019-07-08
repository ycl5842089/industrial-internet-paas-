package cn.chinaunicom.industrialinternet.controllers.user;
import cn.chinaunicom.industrialinternet.entitys.ResultVO;
import cn.chinaunicom.industrialinternet.entitys.user.UserVO;
import cn.chinaunicom.industrialinternet.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/user")
public class UserControllers {
    @Autowired
    IUserService userService;
    @PostMapping("/login")
    public ResultVO login(@RequestBody UserVO userVO){
        ResultVO resultVO = new ResultVO();
        List<UserVO> list1=userService.checkUser(userVO);
        resultVO.setCode(0);
        resultVO.setMsg("登陆成功！");
        resultVO.setData(list1);
        return resultVO;
    }

    @PostMapping("/queryUserMessage")
    public ResultVO queryUserMessage(@RequestBody UserVO userVO){
        ResultVO resultVO = new ResultVO();
        List<UserVO> list1=userService.queryUserMessage(userVO);
        resultVO.setCode(0);
        resultVO.setMsg("登陆成功！");
        resultVO.setData(list1);
        return resultVO;
    }

    @PostMapping("/queryUserCompanyName")
    public ResultVO queryUserCompanyName(){
        ResultVO resultVO = new ResultVO();
        List<UserVO> list1=userService.queryUserCompanyName();
        resultVO.setCode(0);
        resultVO.setMsg("登陆成功！");
        resultVO.setData(list1);
        return resultVO;
    }

}
