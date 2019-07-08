package cn.chinaunicom.industrialinternet.mappers;

import cn.chinaunicom.industrialinternet.entitys.offerProducts.OfferProductsVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OfferProductsMapper {
    public List<OfferProductsVO> getOfferProducts();

    public List<OfferProductsVO> queryAllOfferProducts(OfferProductsVO offerProductsVO);

}
