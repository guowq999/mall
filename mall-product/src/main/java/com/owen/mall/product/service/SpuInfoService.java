package com.owen.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.owen.common.utils.PageUtils;
import com.owen.mall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author owen
 * @email owenguo.mail@gmail.com
 * @date 2023-12-19 22:15:52
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

