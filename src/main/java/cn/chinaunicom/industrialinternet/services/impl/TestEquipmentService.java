package cn.chinaunicom.industrialinternet.services.impl;

import cn.chinaunicom.industrialinternet.entitys.testEquipment.TestEquipmentVO;
import cn.chinaunicom.industrialinternet.mappers.TestEquipmentMapper;
import cn.chinaunicom.industrialinternet.services.ITestEquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestEquipmentService implements ITestEquipmentService {
    @Autowired
    TestEquipmentMapper testEquipmentMapper;
    public List<TestEquipmentVO> getEquipments() {
        return testEquipmentMapper.getEquipments();
    }
}
