package com.owen.mall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.owen.common.utils.PageUtils;
import com.owen.common.utils.Query;

import com.owen.mall.order.dao.SmsSeckillSkuNoticeDao;
import com.owen.mall.order.entity.SmsSeckillSkuNoticeEntity;
import com.owen.mall.order.service.SmsSeckillSkuNoticeService;


@Service("smsSeckillSkuNoticeService")
public class SmsSeckillSkuNoticeServiceImpl extends ServiceImpl<SmsSeckillSkuNoticeDao, SmsSeckillSkuNoticeEntity> implements SmsSeckillSkuNoticeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SmsSeckillSkuNoticeEntity> page = this.page(
                new Query<SmsSeckillSkuNoticeEntity>().getPage(params),
                new QueryWrapper<SmsSeckillSkuNoticeEntity>()
        );

        return new PageUtils(page);
    }

}