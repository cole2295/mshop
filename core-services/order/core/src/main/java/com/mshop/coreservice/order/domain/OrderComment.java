package com.mshop.coreservice.order.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by zhm on 16-11-19.
 */
@Entity
@Table(name="order_comment")
public class OrderComment implements Serializable{
    private static final long serialVersionUID = -500276256591859535L;
    private long id;//主键
    private String uuid;//唯一ID
    private long orderid;//订单ID
    private String content;//评论内容
    private Timestamp inittime;//评论时间

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getInittime() {
        return inittime;
    }

    public void setInittime(Timestamp inittime) {
        this.inittime = inittime;
    }
}
