package com.mshop.coreservice.order.domain;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by zhm on 16-11-19.
 */
@Entity
@Table(name="region_dict")
public class RegionDict implements Serializable{
    private static final long serialVersionUID = 46167568495234254L;
    private int id;//主键
    private String province;//省
    private String city;//市
    private String zone;//区域

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }
}
