package cn.chinaunicom.industrialinternet.mappers;

import cn.chinaunicom.industrialinternet.entitys.passData.PassDataVO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface PassDataMapper {
    public List<PassDataVO> getPassDatas();

}
