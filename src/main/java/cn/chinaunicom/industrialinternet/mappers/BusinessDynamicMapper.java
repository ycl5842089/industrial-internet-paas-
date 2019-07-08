package cn.chinaunicom.industrialinternet.mappers;

import cn.chinaunicom.industrialinternet.entitys.businessDynamic.BusinessDynamicVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BusinessDynamicMapper {
    public List<BusinessDynamicVO>  getBusinessDynamic();
}
