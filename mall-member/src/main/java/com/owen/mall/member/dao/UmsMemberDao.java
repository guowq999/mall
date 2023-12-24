package com.owen.mall.member.dao;

import com.owen.mall.member.entity.UmsMemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author owen
 * @email owenguo.mail@gmail.com
 * @date 2023-12-24 15:01:49
 */
@Mapper
public interface UmsMemberDao extends BaseMapper<UmsMemberEntity> {
	
}
