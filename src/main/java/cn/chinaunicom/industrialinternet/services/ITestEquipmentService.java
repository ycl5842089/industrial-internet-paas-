package cn.chinaunicom.industrialinternet.services;

import cn.chinaunicom.industrialinternet.entitys.testEquipment.TestEquipmentVO;

import java.util.List;

public interface ITestEquipmentService {
    public List<TestEquipmentVO> getEquipments();
}
