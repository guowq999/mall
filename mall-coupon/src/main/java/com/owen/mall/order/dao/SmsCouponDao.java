package com.owen.mall.order.dao;

import com.owen.mall.order.entity.SmsCouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author owen
 * @email owenguo.mail@gmail.com
 * @date 2023-12-24 14:56:31
 */
@Mapper
public interface SmsCouponDao extends BaseMapper<SmsCouponEntity> {
	
}
