package com.owen.mall.order.dao;

import com.owen.mall.order.entity.SmsCouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author owen
 * @email owenguo.mail@gmail.com
 * @date 2023-12-24 14:56:31
 */
@Mapper
public interface SmsCouponHistoryDao extends BaseMapper<SmsCouponHistoryEntity> {
	
}
