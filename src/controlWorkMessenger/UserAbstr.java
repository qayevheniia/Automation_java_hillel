package controlWorkMessenger;

public abstract class UserAbstr {
    private int idUsers;
    private String loginName;
    private String userRole;

    public UserAbstr() {
    }

    public UserAbstr(String loginName, int idUsers) {
        this.idUsers = idUsers;
        this.loginName = loginName;
    }

    public UserAbstr( String loginName) {

        this.loginName = loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginName() {
        return loginName;
    }

    public int getIdUsers() {
        return idUsers;
    }

    public int createIdUser(){
        return idUsers ;
    }

    }

