package cn.chinaunicom.industrialinternet.controllers.homeNews;

import cn.chinaunicom.industrialinternet.entitys.ResultVO;
import cn.chinaunicom.industrialinternet.entitys.homeNews.HomeNewsVO;
import cn.chinaunicom.industrialinternet.entitys.page.PageVO;
import cn.chinaunicom.industrialinternet.services.IHomeNewsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/homeNews")
public class HomeNewsControllers {
    @Autowired
    IHomeNewsService homeNewsService;
    @PostMapping("/getNewses")
    public ResultVO getNewses(@RequestBody PageVO pageVO){
        if(pageVO.getPageNum()==null || pageVO.getPageSize()==null ){
            pageVO.setPageNum(1);
            pageVO.setPageSize(10);
        }
        PageHelper.startPage(pageVO.getPageNum(), pageVO.getPageSize());
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        List<HomeNewsVO> list = homeNewsService.getNewses();
        PageInfo<HomeNewsVO> pageInfo = new PageInfo<>(list);
        resultVO.setMsg("查询成功");
        resultVO.setData(pageInfo);
        return  resultVO;
    }

    @PostMapping("/getHotNewses")
    public ResultVO getHotNewses(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        List<HomeNewsVO> list = homeNewsService.getHotNewses();
        resultVO.setMsg("查询成功");
        resultVO.setData(list);
        return  resultVO;
    }

    @PostMapping("/getRedNewses")
    public ResultVO getRedNewses(){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        List<HomeNewsVO> list = homeNewsService.getRedNewses();
        resultVO.setMsg("查询成功");
        resultVO.setData(list);
        return  resultVO;
    }
}
