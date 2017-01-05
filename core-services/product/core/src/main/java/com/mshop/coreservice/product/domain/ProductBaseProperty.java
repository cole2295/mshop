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
@Table(name="product_base_property")
public class ProductBaseProperty implements Serializable{
    private static final long serialVersionUID = -8729223621525014134L;
    @Id
    @GeneratedValue
    private long id;//主键
    private String uuid;//唯一ID
    private long product_id;//产品ID
    private int property_info_id;//属性名ID
    private int property_info_value_id;//属性值ID
    private int is_sku;//是否为sku 0 否  1 是
    private long skuid;//sku的id
    private Timestamp inittime;//录入时间

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public int getProperty_info_id() {
        return property_info_id;
    }

    public void setProperty_info_id(int property_info_id) {
        this.property_info_id = property_info_id;
    }

    public int getProperty_info_value_id() {
        return property_info_value_id;
    }

    public void setProperty_info_value_id(int property_info_value_id) {
        this.property_info_value_id = property_info_value_id;
    }

    public int getIs_sku() {
        return is_sku;
    }

    public void setIs_sku(int is_sku) {
        this.is_sku = is_sku;
    }

    public long getSkuid() {
        return skuid;
    }

    public void setSkuid(long skuid) {
        this.skuid = skuid;
    }

    public Timestamp getInittime() {
        return inittime;
    }

    public void setInittime(Timestamp inittime) {
        this.inittime = inittime;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
