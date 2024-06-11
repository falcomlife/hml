package com.cotte.estate.bean.pojo.ao.storage;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName OutStorageAo
 * @description: 出库
 * @author: sora
 * @date: 2022-06-26
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
public class OutStorageAo {
    @Id
    @GeneratedValue(generator="uuidGenerator")
    private String id;

    private String orderId;

    private Integer orderPartSumCount;

    private Integer leftPartSumCount;

    private String inStorageId;

    private String inStorageCode;

    private String customerName;

    private String customerNameId;

    private String image;

    private String otimage;

    private String code;
    
    private String name;

    private String poNum;

    private String item;

    private String part;

    private String color;

    private String colorId;

    private String count;

    private BigDecimal partSumCount;

    private BigDecimal bunchCount;

    private String bake;

    private String bakeId;

    private String outCount;

    private String outTypeId;

    private String outType;

    private String inCount;

    private String time;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifiedTime;

    private Integer isDelete;
}
