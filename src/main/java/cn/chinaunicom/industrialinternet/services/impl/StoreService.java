package cn.chinaunicom.industrialinternet.services.impl;

import cn.chinaunicom.industrialinternet.entitys.store.StoreVO;
import cn.chinaunicom.industrialinternet.mappers.StoreMapper;
import cn.chinaunicom.industrialinternet.services.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StoreService implements IStoreService {
    @Autowired
    StoreMapper storeMapper;
    public List<StoreVO> getStore(){
       return storeMapper.getStore();
    }

    public List<StoreVO> getRecommendStore(){
        return storeMapper.getRecommendStore();
    }

    public List<StoreVO> getRankStore(){
        return storeMapper.getRankStore();
    }
}
