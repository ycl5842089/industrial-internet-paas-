package cn.chinaunicom.industrialinternet.entitys.cloudManufacturingSoftware;

import com.github.pagehelper.PageInfo;

public class CloudManufacturingSoftwareVO  {

    public  String  name;

    public  String  softwareName;

    public  Double  softwareValue;

    public  String pictureUrl;

    public String softwareId;

    public String getSoftwareId() {
        return softwareId;
    }

    public void setSoftwareId(String softwareId) {
        this.softwareId = softwareId;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSoftwareName() {
        return softwareName;
    }

    public void setSoftwareName(String softwareName) {
        this.softwareName = softwareName;
    }

    public Double getSoftwareValue() {
        return softwareValue;
    }

    public void setSoftwareValue(Double softwareValue) {
        this.softwareValue = softwareValue;
    }
}
