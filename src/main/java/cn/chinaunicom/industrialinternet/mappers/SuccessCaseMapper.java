package cn.chinaunicom.industrialinternet.mappers;

import cn.chinaunicom.industrialinternet.entitys.successCase.SuccessCaseVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface SuccessCaseMapper {
    public List <SuccessCaseVO>  queryIntelligentizeSuccessCase();

    public List <SuccessCaseVO>  queryNdustrializeSuccessCase();
}
