package com.sdut.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.sdut.common.utils.PageUtils;
import com.sdut.gulimall.member.entity.MemberCollectSpuEntity;

import java.util.Map;

/**
 * 
 *
 * @author JSir
 * @email 2403567035@qq.com
 * @date 2020-04-22 10:57:04
 */
public interface MemberCollectSpuService extends IService<MemberCollectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

