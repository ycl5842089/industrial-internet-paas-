package cn.chinaunicom.industrialinternet.mappers;

import cn.chinaunicom.industrialinternet.entitys.bigDataProduct.BigDataProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BigDataProductMapper {
    public List<BigDataProductVO> getBigDataProducts();
}
