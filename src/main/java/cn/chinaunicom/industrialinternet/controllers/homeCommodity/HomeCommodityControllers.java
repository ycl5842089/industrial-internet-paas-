package cn.chinaunicom.industrialinternet.controllers.homeCommodity;

import cn.chinaunicom.industrialinternet.entitys.ResultVO;
import cn.chinaunicom.industrialinternet.entitys.homeCommodity.homeCommodityVO;
import cn.chinaunicom.industrialinternet.entitys.page.PageVO;
import cn.chinaunicom.industrialinternet.services.IHomeCommodityService;
import cn.chinaunicom.industrialinternet.utills.MultiRequestBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/homeCommodity")
public class HomeCommodityControllers {
    @Autowired
    IHomeCommodityService homeCommodityService;
    @PostMapping("/getCommoditys")
    public ResultVO getCommoditys(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(homeCommodityService.getCommoditys());
        return  resultVO;
    }
    @PostMapping("/queryAllCommoditys")
    /*public ResultVO queryAllCommoditys(@RequestBody String jsondata){
        JSONObject jsonObject = new JSONObject(jsondata);
        int pageNum = jsonObject.getInt("pageNum");
        int pageSize = jsonObject.getInt("pageSize");
        String commodityName = jsonObject.getString("commodityName");
        PageHelper.startPage(pageNum, pageSize);
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        homeCommodityVO homeCommodity = new homeCommodityVO();
        homeCommodity.setCommodityName(commodityName);
        List<homeCommodityVO>list = homeCommodityService.queryAllCommoditys(homeCommodity);
        PageInfo<homeCommodityVO> pageInfo = new PageInfo<>(list);
        resultVO.setData(pageInfo);
        return  resultVO;
    }*/
    public ResultVO queryAllCommoditys(@MultiRequestBody("homecommodity") homeCommodityVO homeCommodityVO ,@MultiRequestBody("page") PageVO pageVO){
        if(pageVO.getPageNum()==null || pageVO.getPageSize()==null ){
            pageVO.setPageNum(1);
            pageVO.setPageSize(10);
        }
        int pageNum = pageVO.getPageNum();
        int pageSize = pageVO.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        List<homeCommodityVO>list = homeCommodityService.queryAllCommoditys(homeCommodityVO);
        PageInfo<homeCommodityVO> pageInfo = new PageInfo<>(list);
        resultVO.setData(pageInfo);
        return  resultVO;
    }

}
