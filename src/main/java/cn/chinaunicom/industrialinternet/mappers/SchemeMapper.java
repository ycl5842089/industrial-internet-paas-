package cn.chinaunicom.industrialinternet.mappers;

import cn.chinaunicom.industrialinternet.entitys.scheme.SchemeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SchemeMapper {
    public List<SchemeVO> getSchemes();

    public List<SchemeVO> queryIntelligentizeSchemes();

    public List<SchemeVO> queryNdustrializeSchemes();
}
