package cn.chinaunicom.industrialinternet.services;

import cn.chinaunicom.industrialinternet.entitys.successCase.SuccessCaseVO;

import java.util.List;

public interface ISuccessCaseService {

    public List<SuccessCaseVO> queryIntelligentizeSuccessCase();

    public List<SuccessCaseVO> queryNdustrializeSuccessCase();
}
