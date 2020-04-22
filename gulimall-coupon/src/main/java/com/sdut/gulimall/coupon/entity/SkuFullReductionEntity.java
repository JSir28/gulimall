package com.sdut.gulimall.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author JSir
 * @email 2403567035@qq.com
 * @date 2020-04-16 22:20:03
 */
@Data
@TableName("sms_sku_full_reduction")
public class SkuFullReductionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * spu_id
	 */
	private Long skuId;
	/**
	 * 
	 */
	private BigDecimal fullPrice;
	/**
	 * 
	 */
	private BigDecimal reducePrice;
	/**
	 * 
	 */
	private Integer addOther;

}
