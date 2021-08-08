package controlWorkMessenger;

public abstract class UserAbstr implements UserInterface{

    private String loginName;
    private String userRole;
    private Integer idUser;

    public UserAbstr() {
    }

    public UserAbstr(String loginName, String userRole, Integer idUser) {
        this.loginName = loginName;
        this.userRole = userRole;
        this.idUser = idUser;
    }

    public UserAbstr(String loginName, int idUsers) {
        this.loginName = loginName;
    }

    public UserAbstr(String loginName) {

        this.loginName = loginName;
    }


    @Override
    public String getLoginName() {
        return loginName;
    }

    @Override
    public String toString() {
        return "UserAbstr{" +
                "loginName='" + loginName + '\'' +
                ", userRole='" + userRole + '\'' +
                ", idUser=" + idUser +
                '}';
    }

    @Override
    public Integer getidUser(String loginName) {
        return null;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}



