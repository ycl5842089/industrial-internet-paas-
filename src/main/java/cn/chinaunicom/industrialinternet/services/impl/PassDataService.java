package cn.chinaunicom.industrialinternet.services.impl;

import cn.chinaunicom.industrialinternet.entitys.passData.PassDataVO;
import cn.chinaunicom.industrialinternet.mappers.PassDataMapper;
import cn.chinaunicom.industrialinternet.services.IPassDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PassDataService implements IPassDataService {
    @Autowired
    PassDataMapper passDataMapper;
    public List<PassDataVO> getPassDatas(){
        return  passDataMapper.getPassDatas();
    }
}
