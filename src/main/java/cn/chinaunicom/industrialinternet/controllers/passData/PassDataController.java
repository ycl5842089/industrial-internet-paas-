package cn.chinaunicom.industrialinternet.controllers.passData;

import cn.chinaunicom.industrialinternet.entitys.ResultVO;
import cn.chinaunicom.industrialinternet.services.IPassDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/passData")
public class PassDataController {
    @Autowired
    IPassDataService passDataService;
    @PostMapping("/getPassDatas")
    public ResultVO getPassDatas(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(passDataService.getPassDatas());
        return  resultVO;
    }
}
