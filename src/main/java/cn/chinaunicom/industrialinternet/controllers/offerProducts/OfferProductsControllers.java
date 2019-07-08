package cn.chinaunicom.industrialinternet.controllers.offerProducts;

import cn.chinaunicom.industrialinternet.entitys.ResultVO;
import cn.chinaunicom.industrialinternet.entitys.offerProducts.OfferProductsVO;
import cn.chinaunicom.industrialinternet.entitys.page.PageVO;
import cn.chinaunicom.industrialinternet.services.IOfferProductsService;
import cn.chinaunicom.industrialinternet.utills.MultiRequestBody;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.text.ParseException;
import java.util.List;
@RestController
@RequestMapping(path = "/offerProducts")
public class OfferProductsControllers {
    @Autowired
    IOfferProductsService offerProductsService;
    @PostMapping("/getOfferProducts")
    public ResultVO getOfferProducts() throws ParseException {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(offerProductsService.getOfferProducts());
        return resultVO;
    }

    @PostMapping("/queryAllOfferProducts")
   /* public ResultVO queryAllOfferProducts(@RequestBody String jsondata){
        JSONObject jsonObject = new JSONObject(jsondata);
        int pageNum = jsonObject.getInt("pageNum");
        int pageSize = jsonObject.getInt("pageSize");
        String offerProductsName = jsonObject.getString("offerProductsName");
        OfferProductsVO offerProductsVO = new OfferProductsVO();
        offerProductsVO.setOfferProductsName(offerProductsName);
        PageHelper.startPage(pageNum, pageSize);
        List<OfferProductsVO> list = offerProductsService.queryAllOfferProducts(offerProductsVO);
        PageInfo<OfferProductsVO> pageInfo = new PageInfo<>(list);
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(pageInfo);
        return resultVO;
    }*/
    public ResultVO queryAllOfferProducts(@MultiRequestBody("offerProducts") OfferProductsVO offerProductsVO ,@MultiRequestBody("page") PageVO pageVO){
        if(pageVO.getPageNum()==null || pageVO.getPageSize()==null ){
            pageVO.setPageNum(1);
            pageVO.setPageSize(10);
        }
        int pageNum = pageVO.getPageNum();
        int pageSize = pageVO.getPageSize();
        PageHelper.startPage(pageNum, pageSize);
        List<OfferProductsVO> list = offerProductsService.queryAllOfferProducts(offerProductsVO);
        PageInfo<OfferProductsVO> pageInfo = new PageInfo<>(list);
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(pageInfo);
        return resultVO;
    }

}
