package com.mshop.coreservice.product.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

/**
 * Created by zhm on 16-11-17.
 */
@Entity
@Table(name="product_tag")
public class ProductTag {
    @Id
    @GeneratedValue
    private long id;
    private String uuid;
    private String name;//标签
    private long product_id;//产品ID
    private Timestamp inittime;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public Timestamp getInittime() {
        return inittime;
    }

    public void setInittime(Timestamp inittime) {
        this.inittime = inittime;
    }
}
