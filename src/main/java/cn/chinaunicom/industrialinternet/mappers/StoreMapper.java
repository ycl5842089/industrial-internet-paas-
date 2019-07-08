package cn.chinaunicom.industrialinternet.mappers;

import cn.chinaunicom.industrialinternet.entitys.store.StoreVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StoreMapper {

    public List<StoreVO> getStore();

    public List<StoreVO> getRecommendStore();

    public List<StoreVO> getRankStore();
}
