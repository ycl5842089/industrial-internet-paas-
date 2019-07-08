package cn.chinaunicom.industrialinternet.entitys.user;

public class UserAffiliatedEnterpriseVO {
    private  String   companyName;

    private  String   joinDate;

    private  String   userAffiliatedEnterpriseId;

    private  String   userId;

    private  String   userAccount;

    public String getUserAffiliatedEnterpriseId() {
        return userAffiliatedEnterpriseId;
    }

    public void setUserAffiliatedEnterpriseId(String userAffiliatedEnterpriseId) {
        this.userAffiliatedEnterpriseId = userAffiliatedEnterpriseId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }
}
