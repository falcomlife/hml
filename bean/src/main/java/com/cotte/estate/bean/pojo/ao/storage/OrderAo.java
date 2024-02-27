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
public class OrderAo {
    @Id
    @GeneratedValue(generator="uuidGenerator")
    private String id;

    private String code;

    private String customerName;

    private String customerNameId;

    private String image;

    private String poNum;

    private String item;

    private String part;

    private String color;

    private String bake;

    private String bakeId;

    private String colorId;

    private BigDecimal count;

    private BigDecimal partSumCount;

    private Integer partSumCountCal;

    private Integer outStroageGoodsSumCount;

    private BigDecimal outStroageSumCount;

    private BigDecimal price;

    private BigDecimal sum;

    private Integer replatCount;

    private BigDecimal replatRatio;

    private Integer incomingCount;

    private BigDecimal incomingRatio;

    private Boolean incomingBigger;

    private Boolean outStorageBigger;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, timezone = "GMT+8", pattern = "yyyy-MM-dd HH:mm:ss")
    private Date modifiedTime;

    private Integer isDelete;
}
