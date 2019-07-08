package cn.chinaunicom.industrialinternet.entitys.offerProducts;

public class OfferProductsVO  {

    private String  offerProductsId;

    private String offerProductsName;

    private Integer   residueDays;

    private Integer   offerNum;

    private String    publishDate;

    private String    closeingDate;

    private String    offerProductsType;

    private  String   region;

    private  String   offerCompany;

    private  String   purchaseCompany;

    public Integer getOfferNum() {
        return offerNum;
    }

    public void setOfferNum(Integer offerNum) {
        this.offerNum = offerNum;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public String getCloseingDate() {
        return closeingDate;
    }

    public void setCloseingDate(String closeingDate) {
        this.closeingDate = closeingDate;
    }

    public String getOfferProductsType() {
        return offerProductsType;
    }

    public void setOfferProductsType(String offerProductsType) {
        this.offerProductsType = offerProductsType;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getOfferCompany() {
        return offerCompany;
    }

    public void setOfferCompany(String offerCompany) {
        this.offerCompany = offerCompany;
    }

    public String getPurchaseCompany() {
        return purchaseCompany;
    }

    public void setPurchaseCompany(String purchaseCompany) {
        this.purchaseCompany = purchaseCompany;
    }

    public String getOfferProductsId() {
        return offerProductsId;
    }

    public void setOfferProductsId(String offerProductsId) {
        this.offerProductsId = offerProductsId;
    }

    public String getOfferProductsName() {
        return offerProductsName;
    }

    public void setOfferProductsName(String offerProductsName) {
        this.offerProductsName = offerProductsName;
    }

    public Integer getResidueDays() {
        return residueDays;
    }

    public void setResidueDays(Integer residueDays) {
        this.residueDays = residueDays;
    }
}
