package com.cotte.estate.bean.pojo.eto;

import lombok.Data;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
public class OrderEto {
    private String code;
    private String customerName;
    private String poNum;
    private String item;
    private String part;
    private String color;
    private String bake;
    private BigDecimal count;
    private BigDecimal price;
    private BigDecimal sum;
    private BigDecimal partSumCount;
    private Integer partSumCountCal;
    private Integer outStroageGoodsSumCount;
    //组件总数-已出库良品组件总数
    private Integer partSumCountSubOutStroageGoodsSumCount;
    //出库组件超过订单组件的数量
    private Integer overPartSumCount;
    private String time;
}
