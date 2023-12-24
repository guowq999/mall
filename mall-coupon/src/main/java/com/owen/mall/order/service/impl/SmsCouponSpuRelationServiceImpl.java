package com.owen.mall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.owen.common.utils.PageUtils;
import com.owen.common.utils.Query;

import com.owen.mall.order.dao.SmsCouponSpuRelationDao;
import com.owen.mall.order.entity.SmsCouponSpuRelationEntity;
import com.owen.mall.order.service.SmsCouponSpuRelationService;


@Service("smsCouponSpuRelationService")
public class SmsCouponSpuRelationServiceImpl extends ServiceImpl<SmsCouponSpuRelationDao, SmsCouponSpuRelationEntity> implements SmsCouponSpuRelationService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsCouponSpuRelationEntity> page = this.page(
                new Query<SmsCouponSpuRelationEntity>().getPage(params),
                new QueryWrapper<SmsCouponSpuRelationEntity>()
        );

        return new PageUtils(page);
    }

}