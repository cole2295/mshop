package com.mshop.coreservice.product.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by zhm on 16-11-17.
 */
@Entity
@Table(name="product_info")
public class ProductInfo implements Serializable{
    private static final long serialVersionUID = 3271318476779892022L;
    @Id
    @GeneratedValue
    private long id;//主键
    private String uuid;//唯一ID
    private long brand_id;//品牌ID
    private String title;//标题
    private String rang_price;//单价区间
    private int pro_type_id;//类目ID
    private long b_userid;//商家ID
    private Timestamp inittime;//发布时间
    private int status;//0 未上架  1 已上架  2 已下架

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPro_type_id() {
        return pro_type_id;
    }

    public void setPro_type_id(int pro_type_id) {
        this.pro_type_id = pro_type_id;
    }

    public long getB_userid() {
        return b_userid;
    }

    public void setB_userid(long b_userid) {
        this.b_userid = b_userid;
    }

    public Timestamp getInittime() {
        return inittime;
    }

    public void setInittime(Timestamp inittime) {
        this.inittime = inittime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(long brand_id) {
        this.brand_id = brand_id;
    }

    public String getRang_price() {
        return rang_price;
    }

    public void setRang_price(String rang_price) {
        this.rang_price = rang_price;
    }
}
