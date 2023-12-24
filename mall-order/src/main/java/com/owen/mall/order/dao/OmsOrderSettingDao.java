package com.owen.mall.order.dao;

import com.owen.mall.order.entity.OmsOrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author owen
 * @email owenguo.mail@gmail.com
 * @date 2023-12-24 14:50:18
 */
@Mapper
public interface OmsOrderSettingDao extends BaseMapper<OmsOrderSettingEntity> {
	
}
