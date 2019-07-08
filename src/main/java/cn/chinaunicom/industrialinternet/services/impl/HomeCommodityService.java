package cn.chinaunicom.industrialinternet.services.impl;

import cn.chinaunicom.industrialinternet.entitys.homeCommodity.homeCommodityVO;
import cn.chinaunicom.industrialinternet.mappers.HomeCommodityMapper;
import cn.chinaunicom.industrialinternet.services.IHomeCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HomeCommodityService implements IHomeCommodityService {
    @Autowired
    HomeCommodityMapper homeCommodityMapper;
    public List<homeCommodityVO> getCommoditys() {
        return homeCommodityMapper.getCommoditys();
    }

    public List<homeCommodityVO> queryAllCommoditys(homeCommodityVO homeCommodity){
        return homeCommodityMapper.queryAllCommoditys(homeCommodity);
    }
}
