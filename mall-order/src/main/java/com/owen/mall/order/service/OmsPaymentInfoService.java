package com.owen.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.owen.common.utils.PageUtils;
import com.owen.mall.order.entity.OmsPaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author owen
 * @email owenguo.mail@gmail.com
 * @date 2023-12-24 14:50:18
 */
public interface OmsPaymentInfoService extends IService<OmsPaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

