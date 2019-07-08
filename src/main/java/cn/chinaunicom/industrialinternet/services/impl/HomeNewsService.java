package cn.chinaunicom.industrialinternet.services.impl;

import cn.chinaunicom.industrialinternet.entitys.homeNews.HomeNewsVO;
import cn.chinaunicom.industrialinternet.mappers.HomeNewsMapper;
import cn.chinaunicom.industrialinternet.mappers.SchemeMapper;
import cn.chinaunicom.industrialinternet.services.IHomeNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HomeNewsService implements IHomeNewsService {
    @Autowired
    HomeNewsMapper homeNewsMapper;
    public List<HomeNewsVO> getNewses(){
        return homeNewsMapper.getNewses();
    }

    public List<HomeNewsVO> getHotNewses(){
        return homeNewsMapper.getHotNewses();
    }

    public List<HomeNewsVO> getRedNewses(){
        return homeNewsMapper.getRedNewses();
    }
}
