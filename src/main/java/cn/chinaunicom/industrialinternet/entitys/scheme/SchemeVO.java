package cn.chinaunicom.industrialinternet.entitys.scheme;

public class SchemeVO {

    private  String  name;

    private  String  schemeText;

    private  String  pictureUrl;

    private  String  schemeId;

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
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

    public String getSchemeText() {
        return schemeText;
    }

    public void setSchemeText(String schemeText) {
        this.schemeText = schemeText;
    }
}
