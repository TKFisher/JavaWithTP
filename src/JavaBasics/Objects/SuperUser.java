package JavaBasics.Objects;




public class SuperUser {

    // instance variables of the User class.
    private String username;
    private String password;

    public static int securityLevel = 2;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
