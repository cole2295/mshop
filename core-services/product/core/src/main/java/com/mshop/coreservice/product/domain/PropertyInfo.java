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
@Table(name="property_info")
public class PropertyInfo implements Serializable {
    private static final long serialVersionUID = 8253466093398281671L;
    @Id
    @GeneratedValue
    private int id;//主键
    private String uuid;//唯一ID
    private String name;//属性名
    private int pro_type_id;//所属栏目ID
    private int is_allow_alias;//是否允许别名  0 否  1 是
    private int is_color;//是否为颜色属性  0 否  1 是
    private int is_enum;//是否为枚举属性  0 否  1 是
    private int is_input;//是否为输入属性  0 否  1 是
    private int is_key_prop;//是否为关键属性  0 否  1 是
    private int is_sales;//是否为销售属性  0 否  1 是
    private int is_search;//是否为搜索属性  0 否  1 是
    private int is_necessary;//是否必须  0 否  1 是
    private int is_multi;//是否多选  0 否  1 是
    private int status;//状态  1 可用 2 不可用
    private int sortnum;//排序
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPro_type_id() {
        return pro_type_id;
    }

    public void setPro_type_id(int pro_type_id) {
        this.pro_type_id = pro_type_id;
    }

    public int getIs_allow_alias() {
        return is_allow_alias;
    }

    public void setIs_allow_alias(int is_allow_alias) {
        this.is_allow_alias = is_allow_alias;
    }

    public int getIs_color() {
        return is_color;
    }

    public void setIs_color(int is_color) {
        this.is_color = is_color;
    }

    public int getIs_enum() {
        return is_enum;
    }

    public void setIs_enum(int is_enum) {
        this.is_enum = is_enum;
    }

    public int getIs_input() {
        return is_input;
    }

    public void setIs_input(int is_input) {
        this.is_input = is_input;
    }

    public int getIs_key_prop() {
        return is_key_prop;
    }

    public void setIs_key_prop(int is_key_prop) {
        this.is_key_prop = is_key_prop;
    }

    public int getIs_sales() {
        return is_sales;
    }

    public void setIs_sales(int is_sales) {
        this.is_sales = is_sales;
    }

    public int getIs_search() {
        return is_search;
    }

    public void setIs_search(int is_search) {
        this.is_search = is_search;
    }

    public int getIs_necessary() {
        return is_necessary;
    }

    public void setIs_necessary(int is_necessary) {
        this.is_necessary = is_necessary;
    }

    public int getIs_multi() {
        return is_multi;
    }

    public void setIs_multi(int is_multi) {
        this.is_multi = is_multi;
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

    public Timestamp getInittime() {
        return inittime;
    }

    public void setInittime(Timestamp inittime) {
        this.inittime = inittime;
    }
}
