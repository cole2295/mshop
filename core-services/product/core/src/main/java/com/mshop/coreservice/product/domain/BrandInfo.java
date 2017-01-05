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
@Table(name = "brand_info")
public class BrandInfo implements Serializable{
    private static final long serialVersionUID = -7114254326024116428L;
    @Id
    @GeneratedValue
    private long id;//主键
    private String uuid;//唯一ID
    private int pro_type_id;//类目id
    private String cn_name;//中文名字
    private String en_name;//英文名字
    private String desc_info;//品牌介绍
    private String logo;//品牌logo
    private String website;//品牌官方首页
    private String story;//品牌故事
    private Timestamp inittime;//创建时间

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

    public int getPro_type_id() {
        return pro_type_id;
    }

    public void setPro_type_id(int pro_type_id) {
        this.pro_type_id = pro_type_id;
    }

    public String getCn_name() {
        return cn_name;
    }

    public void setCn_name(String cn_name) {
        this.cn_name = cn_name;
    }

    public String getEn_name() {
        return en_name;
    }

    public void setEn_name(String en_name) {
        this.en_name = en_name;
    }

    public String getDesc_info() {
        return desc_info;
    }

    public void setDesc_info(String desc_info) {
        this.desc_info = desc_info;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Timestamp getInittime() {
        return inittime;
    }

    public void setInittime(Timestamp inittime) {
        this.inittime = inittime;
    }
}
