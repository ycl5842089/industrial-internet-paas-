package cn.chinaunicom.industrialinternet.services;

import cn.chinaunicom.industrialinternet.entitys.bigDataProduct.BigDataProductVO;

import java.util.List;

public interface IBigDataProductService {
    public List<BigDataProductVO> getBigDataProducts();
}
