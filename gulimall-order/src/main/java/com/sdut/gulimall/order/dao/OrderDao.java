package com.sdut.gulimall.order.dao;

import com.sdut.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author JSir
 * @email 2403567035@qq.com
 * @date 2020-04-22 11:14:14
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
