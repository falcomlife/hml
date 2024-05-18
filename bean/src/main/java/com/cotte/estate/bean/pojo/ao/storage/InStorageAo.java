package com.cotte.estate.bean.pojo.ao.storage;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ClassName orderAO
 * @description: 订单
 * @author: sora
 * @date: 2022-06-26
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class InStorageAo {
    @Id
    @GeneratedValue(generator="uuidGenerator")
    private String id;

    private String orderId;

    private String orderCode;

    private String outStorageId;

    private String outStorageCode;

    private String code;

    private String customerName;

    private String customerNameId;

    private String image;

    private String name;

    private String poNum;

    private String item;

    private String part;

    private String color;

    private String colorId;

    private String orderColor;

    private String orderColorId;

    private BigDecimal count;

    private BigDecimal partSumCount;

    private BigDecimal bunchCount;

    private String bake;

    private String bakeId;

    private String inCount;

    private String unit;
    
    private String unitId;

    private BigDecimal price;

    private BigDecimal sum;

    private String incomingType;

    private String badReason;

    private String incomingTypeId;

    private String incomingReason;

    private String expandType;

    private List<OutStorageAo> outStorageList;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifiedTime;

    private Integer isDelete;
}
