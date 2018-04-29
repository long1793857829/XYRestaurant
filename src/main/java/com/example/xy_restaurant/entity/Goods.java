package com.example.xy_restaurant.entity;

import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author xiangjie
 * @since 2018-04-22
 */
public class Goods extends Model<Goods> {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @TableId(value = "good_id", type = IdType.AUTO)
    private Integer goodId;
    /**
     * 商品编号
     */
    @TableField("good_number")
    private String goodNumber;
    /**
     * 商品名称
     */
    @TableField("good_name")
    private String goodName;

    @TableField("good_depict")
    private String goodDepict;

    @TableField("good_type")
    private Integer goodType;
    /**
     * 商品价格
     */
    @TableField("good_price")
    private Double goodPrice;
    /**
     * 商品数量
     */
    @TableField("good_stock")
    private Integer goodStock;
    /**
     * 商品图片地址
     */
    @TableField("good_img")
    private String goodImg;

    /**
     * 商品类别名称
     */

    @TableField(exist = false)
    private String goodTypeName;

    public String getGoodDepict() {
        return goodDepict;
    }

    public void setGoodDepict(String goodDepict) {
        this.goodDepict = goodDepict;
    }

    public String getGoodTypeName() {
        return goodTypeName;
    }

    public void setGoodTypeName(String goodTypeName) {
        this.goodTypeName = goodTypeName;
    }

    public Integer getGoodId() {
        return goodId;
    }

    public void setGoodId(Integer goodId) {
        this.goodId = goodId;
    }

    public String getGoodNumber() {
        return goodNumber;
    }

    public void setGoodNumber(String goodNumber) {
        this.goodNumber = goodNumber;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public Integer getGoodType() {
        return goodType;
    }

    public void setGoodType(Integer goodType) {
        this.goodType = goodType;
    }

    public Double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
    }

    public Integer getGoodStock() {
        return goodStock;
    }

    public void setGoodStock(Integer goodStock) {
        this.goodStock = goodStock;
    }

    public String getGoodImg() {
        return goodImg;
    }

    public void setGoodImg(String goodImg) {
        this.goodImg = goodImg;
    }

    @Override
    protected Serializable pkVal() {
        return this.goodId;
    }

    @Override
    public String toString() {
        return "Goods{" +
                ", goodId=" + goodId +
                ", goodNumber=" + goodNumber +
                ", goodName=" + goodName +
                ", goodType=" + goodType +
                ", goodPrice=" + goodPrice +
                ", goodStock=" + goodStock +
                ", goodImg=" + goodImg +
                "}";
    }
}
