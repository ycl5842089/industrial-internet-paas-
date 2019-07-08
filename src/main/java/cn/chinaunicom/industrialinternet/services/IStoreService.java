package cn.chinaunicom.industrialinternet.services;

import cn.chinaunicom.industrialinternet.entitys.store.StoreVO;

import java.util.List;

public interface IStoreService {

    public List<StoreVO> getStore();

    public List<StoreVO> getRecommendStore();

    public List<StoreVO> getRankStore();
}
