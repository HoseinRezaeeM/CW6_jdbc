package model;

public class User {
    private int user_id;
    private String username;
    private String password;
    private String sign_data;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

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

    public String getSign_data() {
        return sign_data;
    }

    public void setSign_data(String sign_data) {
        this.sign_data = sign_data;
    }
}
