package com.owen.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.owen.common.utils.PageUtils;
import com.owen.mall.order.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author owen
 * @email owenguo.mail@gmail.com
 * @date 2023-12-19 22:15:52
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();
}

