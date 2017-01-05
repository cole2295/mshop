package com.mshop.coreservice.product.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by zhm on 16-11-19.
 */
@Entity
@Table(name="product_sku_info")
public class ProductSkuInfo implements Serializable{
    private static final long serialVersionUID = -7427707741712507021L;
    @Id
    @GeneratedValue
    private long id;//主键
    private String uuid;//唯一ID
    private long product_id;//产品ID
    private int stock_num;//库存
    private int price;//单价X100 存储
    private String external_code;//外部编码
    private int status;//状态 1 有货 2 无货
    private String title; //sku名称
    private String property_ids;//属性ID串 以英文冒号分割
    private String bar_code;
    private String product_code;
    private Timestamp inittime;//录入时间

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

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public int getStock_num() {
        return stock_num;
    }

    public void setStock_num(int stock_num) {
        this.stock_num = stock_num;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getExternal_code() {
        return external_code;
    }

    public void setExternal_code(String external_code) {
        this.external_code = external_code;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProperty_ids() {
        return property_ids;
    }

    public void setProperty_ids(String property_ids) {
        this.property_ids = property_ids;
    }

    public String getBar_code() {
        return bar_code;
    }

    public void setBar_code(String bar_code) {
        this.bar_code = bar_code;
    }

    public String getProduct_code() {
        return product_code;
    }

    public void setProduct_code(String product_code) {
        this.product_code = product_code;
    }

    public Timestamp getInittime() {
        return inittime;
    }

    public void setInittime(Timestamp inittime) {
        this.inittime = inittime;
    }
}
