package cn.chinaunicom.industrialinternet.services.impl;

import cn.chinaunicom.industrialinternet.entitys.offerProducts.OfferProductsVO;
import cn.chinaunicom.industrialinternet.mappers.OfferProductsMapper;
import cn.chinaunicom.industrialinternet.services.IOfferProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 首页查询报价商品
 */
@Service
public class OfferProductsService  implements IOfferProductsService {
    @Autowired
    OfferProductsMapper offerProductsMapper;
    public List<OfferProductsVO> getOfferProducts() throws ParseException {
        List<OfferProductsVO> list = offerProductsMapper.getOfferProducts();
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
        String  date = df.format(new Date());
        if(list.size()>0){
            int i;
            for ( i = 0; i<list.size(); i++){
                String  closeingDate = list.get(i).getCloseingDate();
                Date d1 = df.parse(date);
                Date d2 = df.parse(closeingDate);
                int residueDays = (int)((d2.getTime() - d1.getTime()) / (24 * 60 * 60 * 1000));
                list.get(i).setResidueDays(residueDays);
            }
        }
        return  list;
    }

    public List<OfferProductsVO> queryAllOfferProducts(OfferProductsVO offerProductsVO){return offerProductsMapper.queryAllOfferProducts(offerProductsVO);}
}
