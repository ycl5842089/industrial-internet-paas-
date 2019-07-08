package cn.chinaunicom.industrialinternet.controllers.store;

import cn.chinaunicom.industrialinternet.entitys.ResultVO;
import cn.chinaunicom.industrialinternet.services.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/store")
public class StoreController {
    @Autowired
    IStoreService storeService;
    @PostMapping("/getStore")
    public ResultVO  getStore(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(storeService.getStore());
        return  resultVO;
    }
    @PostMapping("/getRecommendStore")
    public ResultVO  getRecommendStore(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(storeService.getRecommendStore());
        return  resultVO;
    }
    @PostMapping("/getRankStore")
    public ResultVO  getRankStore(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(storeService.getRankStore());
        return  resultVO;
    }
}
