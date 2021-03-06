package com.sdut.gulimall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sdut.common.utils.PageUtils;
import com.sdut.gulimall.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author JSir
 * @email 2403567035@qq.com
 * @date 2020-04-22 11:18:57
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

