package cn.chinaunicom.industrialinternet.entitys.homeCommodity;

public class homeCommodityVO {
    private String commodityId;

    private String  commodityName;

    private Double  commodityValue;

    private  String exchangeType;

    private  String pictureUrl;

    private String  classify;

    private String  commodityCompany;

    private  String  offerCompany;

    private  String  region;

    private  String  timeRemaining;

    private  String  purchaseAmount;

    public String getPurchaseAmount() {
        return purchaseAmount;
    }

    public void setPurchaseAmount(String purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Double getCommodityValue() {
        return commodityValue;
    }

    public void setCommodityValue(Double commodityValue) {
        this.commodityValue = commodityValue;
    }

    public String getExchangeType() {
        return exchangeType;
    }

    public void setExchangeType(String exchangeType) {
        this.exchangeType = exchangeType;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    public String getCommodityCompany() {
        return commodityCompany;
    }

    public void setCommodityCompany(String commodityCompany) {
        this.commodityCompany = commodityCompany;
    }

    public String getOfferCompany() {
        return offerCompany;
    }

    public void setOfferCompany(String offerCompany) {
        this.offerCompany = offerCompany;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(String timeRemaining) {
        this.timeRemaining = timeRemaining;
    }
}
