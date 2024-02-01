package com.owen.mall.order.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.owen.common.utils.PageUtils;
import com.owen.common.utils.Query;

import com.owen.mall.order.dao.CategoryDao;
import com.owen.mall.order.entity.CategoryEntity;
import com.owen.mall.order.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> allCategoryEntities = baseMapper.selectList(null);
        return allCategoryEntities.stream()
                .filter(s -> s.getParentCid() == 0)
                .peek(cur -> cur.setChildCategoryEntities(getChildrens(cur, allCategoryEntities)))
                .sorted(Comparator.comparing(CategoryEntity::getSort)).collect(Collectors.toList());
    }

    // 递归查找所有菜单的子菜单
    private List<CategoryEntity> getChildrens(CategoryEntity root, List<CategoryEntity> all) {
        return all.stream()
                .filter(s -> Objects.equals(s.getParentCid(), root.getCatId()))
                .peek(cur -> cur.setChildCategoryEntities(getChildrens(cur, all)))
                .sorted(Comparator.comparing(CategoryEntity::getSort)).collect(Collectors.toList());
    }

}