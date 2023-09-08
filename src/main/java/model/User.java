package model;

public class User {
    private Integer user_id;
    private String username;
    private String password;
    private String signup_date;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
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

    public String getSignup_date() {
        return signup_date;
    }

    public void setSignup_date(String signup_date) {
        this.signup_date = signup_date;
    }
    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", signup_date='" + signup_date + '\'' +
                '}';
    }

    public User(Integer user_id, String username, String password, String sign_data) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.signup_date = sign_data;
    }
}
