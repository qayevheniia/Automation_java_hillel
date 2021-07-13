package pageObject;

public class UserManager {

    private static String USERNAME = "vasya";
    private static String PASSWORD = "pupkin";


    private String userName;

    private User authorise(String userName, String password) throws Exception {
        // my super logic

        if (userName == null || !userName.equals(USERNAME)) {
            throw new Exception("Wrong username or password");
        }

        if (password == null || !password.equals(PASSWORD)) throw new Exception("Wrong username or password");

        return new User(userName);
    }

    public User login() throws Exception {
        String userName = Utils.readParameter("User name");
        String password = Utils.readParameter("password");
        return authorise(userName, password);
    }

}



