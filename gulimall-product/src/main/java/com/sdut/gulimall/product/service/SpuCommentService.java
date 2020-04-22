package com.sdut.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sdut.common.utils.PageUtils;
import com.sdut.gulimall.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 
 *
 * @author JSir
 * @email 2403567035@qq.com
 * @date 2020-04-15 20:42:13
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

