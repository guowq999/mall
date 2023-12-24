package com.owen.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.owen.common.utils.PageUtils;
import com.owen.mall.ware.entity.WmsWareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author owen
 * @email owenguo.mail@gmail.com
 * @date 2023-12-24 15:05:22
 */
public interface WmsWareSkuService extends IService<WmsWareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

