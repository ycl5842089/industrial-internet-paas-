package cn.chinaunicom.industrialinternet.services.impl;

import cn.chinaunicom.industrialinternet.entitys.bigDataProduct.BigDataProductVO;
import cn.chinaunicom.industrialinternet.mappers.BigDataProductMapper;
import cn.chinaunicom.industrialinternet.services.IBigDataProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BigDataProductService implements IBigDataProductService {
    @Autowired
    BigDataProductMapper bigDataProductMapper;
    public List<BigDataProductVO> getBigDataProducts(){
        return  bigDataProductMapper.getBigDataProducts();
    }
}
