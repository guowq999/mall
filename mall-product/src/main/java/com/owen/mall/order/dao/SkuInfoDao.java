package com.owen.mall.order.dao;

import com.owen.mall.order.entity.SkuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku信息
 * 
 * @author owen
 * @email owenguo.mail@gmail.com
 * @date 2023-12-19 22:15:51
 */
@Mapper
public interface SkuInfoDao extends BaseMapper<SkuInfoEntity> {
	
}
