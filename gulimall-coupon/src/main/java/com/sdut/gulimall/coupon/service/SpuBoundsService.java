package com.sdut.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sdut.common.utils.PageUtils;
import com.sdut.gulimall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 
 *
 * @author JSir
 * @email 2403567035@qq.com
 * @date 2020-04-16 22:20:03
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

