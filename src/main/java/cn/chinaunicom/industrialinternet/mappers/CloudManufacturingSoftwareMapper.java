package cn.chinaunicom.industrialinternet.mappers;

import cn.chinaunicom.industrialinternet.entitys.cloudManufacturingSoftware.CloudManufacturingSoftwareVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CloudManufacturingSoftwareMapper {
    public List<CloudManufacturingSoftwareVO>  getCloudManufacturingSoftwares();
}
