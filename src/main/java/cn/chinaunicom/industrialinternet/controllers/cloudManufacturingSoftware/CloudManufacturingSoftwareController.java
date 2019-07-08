package cn.chinaunicom.industrialinternet.controllers.cloudManufacturingSoftware;

import cn.chinaunicom.industrialinternet.entitys.ResultVO;
import cn.chinaunicom.industrialinternet.services.ICloudManufacturingSoftwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/cloudManufacturingSoftware")
public class CloudManufacturingSoftwareController {
    @Autowired
    ICloudManufacturingSoftwareService cloudManufacturingSoftwareService;
    @PostMapping("/getCloudManufacturingSoftwares")
   public ResultVO getCloudManufacturingSoftwares(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(cloudManufacturingSoftwareService.getCloudManufacturingSoftwares());
        return  resultVO;
    }

}
