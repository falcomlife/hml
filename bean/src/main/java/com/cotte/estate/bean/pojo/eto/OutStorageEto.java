package com.cotte.estate.bean.pojo.eto;

import lombok.Data;

import javax.persistence.Entity;
import java.math.BigDecimal;

@Entity
@Data
public class OutStorageEto {
    private String code;
    private String customerName;
    private String poNum;
    private String item;
    private String part;
    private String color;
    private String bake;
    private String inCount;
    private BigDecimal bunchCount;
}
