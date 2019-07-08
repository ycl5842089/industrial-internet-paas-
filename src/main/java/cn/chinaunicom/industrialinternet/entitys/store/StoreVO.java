package cn.chinaunicom.industrialinternet.entitys.store;

public class StoreVO {
    private  String  commodityName;

    private  String  commodityValue;

    private  String  pictureUrl;

    private  String  navigationPictureUrl;

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public String getCommodityValue() {
        return commodityValue;
    }

    public void setCommodityValue(String commodityValue) {
        this.commodityValue = commodityValue;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getNavigationPictureUrl() {
        return navigationPictureUrl;
    }

    public void setNavigationPictureUrl(String navigationPictureUrl) {
        this.navigationPictureUrl = navigationPictureUrl;
    }
}
