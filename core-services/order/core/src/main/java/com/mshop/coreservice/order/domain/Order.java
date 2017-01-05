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
@Table(name="order")
public class Order implements Serializable{
    private static final long serialVersionUID = 660227392583666870L;
    @Id
    @GeneratedValue
    private long id;//主键
    private String uuid;//唯一ID
    private String seq_no;//订单序列号
    private Timestamp inittime;//下单时间
    private Timestamp paytime;//支付时间
    private String logistics;//物流类型
    private long product_id;//产品ID
    private long sku_id;//sku ID
    private long buy_userid;//买家ID
    private int status;//订单状态  0：未付款   1：已付款  2：交易成功
    private int type;//订单类型
    private int total;//总金额  X100
    private int pay;//实付金额 X100
    private int reduce_fee;//减免金额 X100
    private int has_post_fee;//是否有邮费  0 无 1 有
    private int post_fee;//邮费
    private int use_points;//使用点数
    private int return_points;//返回点数
    private int buy_user_ip;//买家IP地址
    private String buy_address;//邮寄详细地址
    private int region_id;//地区ID

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

    public String getSeq_no() {
        return seq_no;
    }

    public void setSeq_no(String seq_no) {
        this.seq_no = seq_no;
    }

    public Timestamp getInittime() {
        return inittime;
    }

    public void setInittime(Timestamp inittime) {
        this.inittime = inittime;
    }

    public Timestamp getPaytime() {
        return paytime;
    }

    public void setPaytime(Timestamp paytime) {
        this.paytime = paytime;
    }

    public String getLogistics() {
        return logistics;
    }

    public void setLogistics(String logistics) {
        this.logistics = logistics;
    }

    public long getBuy_userid() {
        return buy_userid;
    }

    public void setBuy_userid(long buy_userid) {
        this.buy_userid = buy_userid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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

    public int getReduce_fee() {
        return reduce_fee;
    }

    public void setReduce_fee(int reduce_fee) {
        this.reduce_fee = reduce_fee;
    }

    public int getHas_post_fee() {
        return has_post_fee;
    }

    public void setHas_post_fee(int has_post_fee) {
        this.has_post_fee = has_post_fee;
    }

    public int getPost_fee() {
        return post_fee;
    }

    public void setPost_fee(int post_fee) {
        this.post_fee = post_fee;
    }

    public int getUse_points() {
        return use_points;
    }

    public void setUse_points(int use_points) {
        this.use_points = use_points;
    }

    public int getReturn_points() {
        return return_points;
    }

    public void setReturn_points(int return_points) {
        this.return_points = return_points;
    }

    public int getBuy_user_ip() {
        return buy_user_ip;
    }

    public void setBuy_user_ip(int buy_user_ip) {
        this.buy_user_ip = buy_user_ip;
    }

    public String getBuy_address() {
        return buy_address;
    }

    public void setBuy_address(String buy_address) {
        this.buy_address = buy_address;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
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
