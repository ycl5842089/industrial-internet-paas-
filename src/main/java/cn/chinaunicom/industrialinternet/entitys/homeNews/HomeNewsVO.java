package cn.chinaunicom.industrialinternet.entitys.homeNews;

public class HomeNewsVO  {
    private  Integer newsId;

    private String   newsName;

    private String   newsText;

    private  String  ISHot;

    private String   ISRead;

    public String getISHot() {
        return ISHot;
    }

    public void setISHot(String ISHot) {
        this.ISHot = ISHot;
    }

    public String getISRead() {
        return ISRead;
    }

    public void setISRead(String ISRead) {
        this.ISRead = ISRead;
    }

    public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsName() {
        return newsName;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }
}
