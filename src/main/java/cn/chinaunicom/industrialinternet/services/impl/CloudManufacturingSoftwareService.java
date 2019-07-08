package cn.chinaunicom.industrialinternet.services.impl;

import cn.chinaunicom.industrialinternet.entitys.cloudManufacturingSoftware.CloudManufacturingSoftwareVO;
import cn.chinaunicom.industrialinternet.mappers.CloudManufacturingSoftwareMapper;
import cn.chinaunicom.industrialinternet.services.ICloudManufacturingSoftwareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudManufacturingSoftwareService implements ICloudManufacturingSoftwareService {
    @Autowired
    CloudManufacturingSoftwareMapper  cloudManufacturingSoftwareMapper;
    public List<CloudManufacturingSoftwareVO> getCloudManufacturingSoftwares(){
        return  cloudManufacturingSoftwareMapper.getCloudManufacturingSoftwares();
    }
}
