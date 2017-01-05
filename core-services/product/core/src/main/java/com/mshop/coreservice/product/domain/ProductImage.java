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
@Table(name="product_image")
public class ProductImage implements Serializable{
    private static final long serialVersionUID = -3015242523849490111L;
    @Id
    @GeneratedValue
    private long id;//主键
    private String uuid;//唯一ID
    private long product_id;//产品ID
    private int pic_position;//图片位置  1：首页 2：列表 3：详情 slider
    private int pic_plat;//图片适用机型  1：电脑   2：手机+平板
    private String pic_url;//图片地址
    private int is_main_pic;//是否为主图 0 否 1 是
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

    public int getPic_position() {
        return pic_position;
    }

    public void setPic_position(int pic_position) {
        this.pic_position = pic_position;
    }

    public int getPic_plat() {
        return pic_plat;
    }

    public void setPic_plat(int pic_plat) {
        this.pic_plat = pic_plat;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }

    public int getIs_main_pic() {
        return is_main_pic;
    }

    public void setIs_main_pic(int is_main_pic) {
        this.is_main_pic = is_main_pic;
    }

    public Timestamp getInittime() {
        return inittime;
    }

    public void setInittime(Timestamp inittime) {
        this.inittime = inittime;
    }
}
