package cn.chinaunicom.industrialinternet.controllers.testEquipment;

import cn.chinaunicom.industrialinternet.entitys.ResultVO;
import cn.chinaunicom.industrialinternet.services.ITestEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/testEquipment")
public class TestEquipmentController {
    @Autowired
    ITestEquipmentService testEquipmentService;
    @PostMapping("/getEquipments")
    public ResultVO getEquipments(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(testEquipmentService.getEquipments());
        return  resultVO;
    }
}
