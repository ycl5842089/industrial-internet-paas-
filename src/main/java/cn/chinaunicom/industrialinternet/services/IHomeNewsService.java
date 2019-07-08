package cn.chinaunicom.industrialinternet.services;

import cn.chinaunicom.industrialinternet.entitys.homeNews.HomeNewsVO;

import java.util.List;

public interface IHomeNewsService {
    public List<HomeNewsVO> getNewses();

    public List<HomeNewsVO> getHotNewses();

    public List<HomeNewsVO> getRedNewses();
}
