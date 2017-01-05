package com.mshop.coreservice.user.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by zhm on 16-11-17.
 */
public class UserInfo implements Serializable{

    private static final long serialVersionUID = -1322268545869952821L;
    private long id;
    private String username;
    private String password;
    private String email;
    private String mobile;
    private Timestamp inittime;
    private Timestamp lastlogin;
    private int status;//0 未激活  1  已激活  2 冻结
    private int type;// 1 商家  2 卖家

    public UserInfo(String username, String password, String email, String mobile, int type) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        Timestamp currts = new Timestamp(new Date().getTime());
        this.inittime = currts;
        this.lastlogin = currts;
        this.status = 0;
        this.type = type;
    }

    public UserInfo(String username, String password, String email, String mobile, int type, int status) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.mobile = mobile;
        this.status = status;
        Timestamp currts = new Timestamp(new Date().getTime());
        this.inittime = currts;
        this.lastlogin = currts;
        this.type = type;
    }

    public UserInfo() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Timestamp getInittime() {
        return inittime;
    }

    public void setInittime(Timestamp inittime) {
        this.inittime = inittime;
    }

    public Timestamp getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(Timestamp lastlogin) {
        this.lastlogin = lastlogin;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", inittime=" + inittime +
                ", lastlogin=" + lastlogin +
                ", status=" + status +
                '}';
    }
}
