package com.owen.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.owen.common.utils.PageUtils;
import com.owen.mall.order.entity.SmsCouponSpuRelationEntity;

import java.util.Map;

/**
 * 优惠券与产品关联
 *
 * @author owen
 * @email owenguo.mail@gmail.com
 * @date 2023-12-24 14:56:30
 */
public interface SmsCouponSpuRelationService extends IService<SmsCouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

