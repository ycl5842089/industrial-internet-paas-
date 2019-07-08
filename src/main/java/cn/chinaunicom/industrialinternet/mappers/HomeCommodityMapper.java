package cn.chinaunicom.industrialinternet.mappers;

import cn.chinaunicom.industrialinternet.entitys.homeCommodity.homeCommodityVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface HomeCommodityMapper {
    public List<homeCommodityVO> getCommoditys();

    public List<homeCommodityVO> queryAllCommoditys(homeCommodityVO homeCommodity);
}
