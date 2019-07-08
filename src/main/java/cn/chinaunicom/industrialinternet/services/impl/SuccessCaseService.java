package cn.chinaunicom.industrialinternet.services.impl;

import cn.chinaunicom.industrialinternet.entitys.successCase.SuccessCaseVO;
import cn.chinaunicom.industrialinternet.mappers.SuccessCaseMapper;
import cn.chinaunicom.industrialinternet.services.ISuccessCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuccessCaseService  implements ISuccessCaseService {
    @Autowired
    SuccessCaseMapper successCaseMapper;
    public List<SuccessCaseVO> queryIntelligentizeSuccessCase(){
      return   successCaseMapper.queryIntelligentizeSuccessCase();
    }

    public List<SuccessCaseVO> queryNdustrializeSuccessCase(){
        return   successCaseMapper.queryNdustrializeSuccessCase();
    }
}
