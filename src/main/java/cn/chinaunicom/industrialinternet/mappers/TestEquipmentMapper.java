package cn.chinaunicom.industrialinternet.mappers;

import cn.chinaunicom.industrialinternet.entitys.testEquipment.TestEquipmentVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestEquipmentMapper {
    public List<TestEquipmentVO>  getEquipments();
}
