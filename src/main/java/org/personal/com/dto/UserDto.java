package org.personal.com.dto;


public class UserDto {
    private String usertype;
    private String username;
    private String password;

    public UserDto(String usertype, String username, String password) {
        this.usertype = usertype.toString();
        this.username = username;
        this.password = password;
    }

    public String getUsertype() {
        return usertype;
    }

    public String getPassword() {
        return password;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
