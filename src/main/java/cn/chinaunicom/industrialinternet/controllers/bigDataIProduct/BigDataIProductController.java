package cn.chinaunicom.industrialinternet.controllers.bigDataIProduct;

import cn.chinaunicom.industrialinternet.entitys.ResultVO;
import cn.chinaunicom.industrialinternet.services.IBigDataProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/bigDataIProduct")
public class BigDataIProductController {
    @Autowired
    IBigDataProductService bigDataProductService;
    @PostMapping("/getBigDataProducts")
    public ResultVO  getBigDataProducts(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(bigDataProductService.getBigDataProducts());
        return  resultVO;

    }
}
