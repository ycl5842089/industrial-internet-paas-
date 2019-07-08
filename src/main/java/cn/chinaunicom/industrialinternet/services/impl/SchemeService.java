package cn.chinaunicom.industrialinternet.services.impl;

import cn.chinaunicom.industrialinternet.entitys.scheme.SchemeVO;
import cn.chinaunicom.industrialinternet.mappers.SchemeMapper;
import cn.chinaunicom.industrialinternet.services.ISchemeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SchemeService implements ISchemeService {
    @Autowired
    SchemeMapper  schemeMapper;
    public List<SchemeVO> getSchemes(){
        return schemeMapper.getSchemes();
    }

    public List<SchemeVO> queryIntelligentizeSchemes(){
        return  schemeMapper.queryIntelligentizeSchemes();
    }

    public List<SchemeVO> queryNdustrializeSchemes(){return  schemeMapper.queryNdustrializeSchemes();}
}
