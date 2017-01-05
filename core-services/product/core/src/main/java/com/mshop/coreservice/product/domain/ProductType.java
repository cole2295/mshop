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
@Table(name="product_type")
public class ProductType implements Serializable{

    private static final long serialVersionUID = -3743778568025371698L;
    @Id
    @GeneratedValue
    private int id; //主键
    private String uuid; //唯一ID
    private String name; //类目名称
    private String icon; //类目图标
    private String cover; //封面图片
    private int parent_id;//父节点id
    //位置，若为顶级类型，则为 0，
    // 否则路径为通过 '/' 连接上级类型的路径与上级的ID而成的字符串，
    // 比如ID为 1 的类型的路径为 0，它有一个子分类ID为2，
    // 那么子分类2的路径就为 0/1，若该子分类还有一个ID为3的子分类，
    // 那么3的位置即为：0/1/2
    private String location;
    private Timestamp inittime; //发布时间
    private int status;//1  正常  2 不可用
    private int sortnum;//排序

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public int getParent_id() {
        return parent_id;
    }

    public void setParent_id(int parent_id) {
        this.parent_id = parent_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public int getSortnum() {
        return sortnum;
    }

    public void setSortnum(int sortnum) {
        this.sortnum = sortnum;
    }

    @Override
    public String toString() {
        return "ProductTypeReponsitory{" +
                "id=" + id +
                ", uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", cover='" + cover + '\'' +
                ", parent_id=" + parent_id +
                ", location='" + location + '\'' +
                ", inittime=" + inittime +
                ", status=" + status +
                ", sortnum=" + sortnum +
                '}';
    }
}
