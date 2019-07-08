package cn.chinaunicom.industrialinternet.controllers.businessDynamic;

import cn.chinaunicom.industrialinternet.entitys.ResultVO;
import cn.chinaunicom.industrialinternet.services.IBusinessDynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/businessDynamic")
public class BusinessDynamicController {
    @Autowired
    IBusinessDynamicService businessDynamicService;
    @PostMapping("/getBusinessDynamic")
    public ResultVO getBusinessDynamic(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(businessDynamicService.getBusinessDynamic());
        return  resultVO;
    }

}
