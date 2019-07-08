package cn.chinaunicom.industrialinternet.services;

import cn.chinaunicom.industrialinternet.entitys.homeCommodity.homeCommodityVO;

import java.util.List;

public interface IHomeCommodityService {
    public List<homeCommodityVO> getCommoditys();

    public List<homeCommodityVO> queryAllCommoditys(homeCommodityVO homeCommodity);
}
