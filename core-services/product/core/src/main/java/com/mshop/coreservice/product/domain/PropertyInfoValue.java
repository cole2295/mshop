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
@Table(name="property_info_value")
public class PropertyInfoValue implements Serializable {
    private static final long serialVersionUID = 7504027556932148298L;
    @Id
    @GeneratedValue
    private int id;//主键
    private String uuid;//唯一ID
    private String prop_value;//属性值
    private int prop_id;//属性ID
    private int status; //1 可用  2 不可用
    private int sortnum;//排序
    private int pro_type_id;//类目ID
    private Timestamp inittime;//录入时间

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getProp_value() {
        return prop_value;
    }

    public void setProp_value(String prop_value) {
        this.prop_value = prop_value;
    }

    public int getProp_id() {
        return prop_id;
    }

    public void setProp_id(int prop_id) {
        this.prop_id = prop_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getSortnum() {
        return sortnum;
    }

    public void setSortnum(int sortnum) {
        this.sortnum = sortnum;
    }

    public int getPro_type_id() {
        return pro_type_id;
    }

    public void setPro_type_id(int pro_type_id) {
        this.pro_type_id = pro_type_id;
    }

    public Timestamp getInittime() {
        return inittime;
    }

    public void setInittime(Timestamp inittime) {
        this.inittime = inittime;
    }
}
