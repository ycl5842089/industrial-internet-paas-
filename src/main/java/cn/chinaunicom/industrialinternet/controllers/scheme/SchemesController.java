package cn.chinaunicom.industrialinternet.controllers.scheme;

import cn.chinaunicom.industrialinternet.entitys.ResultVO;
import cn.chinaunicom.industrialinternet.entitys.page.PageVO;
import cn.chinaunicom.industrialinternet.entitys.scheme.SchemeVO;
import cn.chinaunicom.industrialinternet.services.ISchemeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/schemes")
public class SchemesController {
    @Autowired
    ISchemeService schemeService;
    @PostMapping("/getSchemes")
    public ResultVO getSchemes(@RequestBody PageVO pageVO){
        if(pageVO.getPageNum()==null || pageVO.getPageSize()==null ){
            pageVO.setPageNum(1);
            pageVO.setPageSize(10);
        }
        PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        List<SchemeVO> list = schemeService.getSchemes();
        PageInfo<SchemeVO> pageInfo = new PageInfo<>(list);
        resultVO.setData(pageInfo);
        return  resultVO;
    }
/*
查询智能化页面案例
 */
    @PostMapping("/queryIntelligentizeSchemes")
    public ResultVO queryIntelligentizeSchemes(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(schemeService.queryIntelligentizeSchemes());
        return  resultVO;
    }

    /*
查询工业大数据页面案例
 */
    @PostMapping("/queryNdustrializeSchemes")
    public ResultVO queryNdustrializeSchemes(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(schemeService.queryIntelligentizeSchemes());
        return  resultVO;
    }
}
