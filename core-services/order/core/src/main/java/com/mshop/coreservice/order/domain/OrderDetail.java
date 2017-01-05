package com.mshop.coreservice.order.domain;

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
@Table(name="order_detail")
public class OrderDetail implements Serializable{
    private static final long serialVersionUID = 8984471224606619430L;
    @Id
    @GeneratedValue
    private long id;//主键
    private String uuid;//唯一ID
    private long order_id;//订单ID
    private int status;//状态  0：未付款   1：已付款  2：交易成功
    private String product_name;//商品名称
    private int total;//总金额
    private int pay;//实付金额
    private int buy_num;//购买数量
    private String range_price;//价格区间
    private int reduce_fee;//减免金额
    private Timestamp inittime;//下单时间
    private long product_id;//产品ID
    private long sku_id;//sku ID

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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPay() {
        return pay;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    public int getBuy_num() {
        return buy_num;
    }

    public void setBuy_num(int buy_num) {
        this.buy_num = buy_num;
    }

    public String getRange_price() {
        return range_price;
    }

    public void setRange_price(String range_price) {
        this.range_price = range_price;
    }

    public int getReduce_fee() {
        return reduce_fee;
    }

    public void setReduce_fee(int reduce_fee) {
        this.reduce_fee = reduce_fee;
    }

    public Timestamp getInittime() {
        return inittime;
    }

    public void setInittime(Timestamp inittime) {
        this.inittime = inittime;
    }

    public long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(long order_id) {
        this.order_id = order_id;
    }

    public long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(long product_id) {
        this.product_id = product_id;
    }

    public long getSku_id() {
        return sku_id;
    }

    public void setSku_id(long sku_id) {
        this.sku_id = sku_id;
    }
}
