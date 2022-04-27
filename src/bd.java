public class bd {
    String User = "admin";
    String password = "root";

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public bd(String user, String password) {
        User = user;
        this.password = password;
    }
}


