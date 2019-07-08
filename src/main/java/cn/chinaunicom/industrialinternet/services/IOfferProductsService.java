package cn.chinaunicom.industrialinternet.services;

import cn.chinaunicom.industrialinternet.entitys.offerProducts.OfferProductsVO;

import java.text.ParseException;
import java.util.List;

public interface IOfferProductsService {
    public List<OfferProductsVO> getOfferProducts() throws ParseException;

    public List<OfferProductsVO> queryAllOfferProducts(OfferProductsVO offerProductsVO);
}
