package cn.chinaunicom.industrialinternet.controllers.successCase;

import cn.chinaunicom.industrialinternet.entitys.ResultVO;
import cn.chinaunicom.industrialinternet.services.ISuccessCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/successCase")
public class SuccessCaseController {
    @Autowired
    ISuccessCaseService successCaseService;
    @PostMapping("/queryIntelligentizeSuccessCase")
    public ResultVO queryIntelligentizeSuccessCase(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(successCaseService.queryIntelligentizeSuccessCase());
        return  resultVO;
    }
    @PostMapping("/queryNdustrializeSuccessCase")
    public ResultVO queryNdustrializeSuccessCase(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(successCaseService.queryNdustrializeSuccessCase());
        return  resultVO;
    }

}
