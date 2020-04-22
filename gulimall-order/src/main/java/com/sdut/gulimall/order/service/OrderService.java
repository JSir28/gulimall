package com.sdut.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sdut.common.utils.PageUtils;
import com.sdut.gulimall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author JSir
 * @email 2403567035@qq.com
 * @date 2020-04-22 11:14:14
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

