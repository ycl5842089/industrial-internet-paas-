package cn.chinaunicom.industrialinternet.services.impl;

import cn.chinaunicom.industrialinternet.entitys.businessDynamic.BusinessDynamicVO;
import cn.chinaunicom.industrialinternet.mappers.BusinessDynamicMapper;
import cn.chinaunicom.industrialinternet.services.IBusinessDynamicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BusinessDynamicService implements IBusinessDynamicService {
    @Autowired
    BusinessDynamicMapper businessDynamicMapper;
    public List<BusinessDynamicVO> getBusinessDynamic(){
        return businessDynamicMapper.getBusinessDynamic();
    }
}
