package cn.chinaunicom.industrialinternet.mappers;

import cn.chinaunicom.industrialinternet.entitys.homeNews.HomeNewsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface HomeNewsMapper {

    public List<HomeNewsVO> getNewses();

    public List<HomeNewsVO> getHotNewses();

    public List<HomeNewsVO> getRedNewses();
}
