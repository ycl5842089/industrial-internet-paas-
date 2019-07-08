package cn.chinaunicom.industrialinternet.services;

import cn.chinaunicom.industrialinternet.entitys.scheme.SchemeVO;

import java.util.List;

public interface ISchemeService {
    public List<SchemeVO> getSchemes();

    public List<SchemeVO> queryIntelligentizeSchemes();

    public List<SchemeVO> queryNdustrializeSchemes();
}
