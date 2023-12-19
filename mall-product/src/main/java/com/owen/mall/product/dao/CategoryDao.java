package com.owen.mall.product.dao;

import com.owen.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author owen
 * @email owenguo.mail@gmail.com
 * @date 2023-12-19 22:15:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
