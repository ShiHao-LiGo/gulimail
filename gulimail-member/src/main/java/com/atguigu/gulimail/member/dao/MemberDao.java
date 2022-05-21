package com.atguigu.gulimail.member.dao;

import com.atguigu.gulimail.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author lishihao
 * @email 861289310@qq.com
 * @date 2022-05-21 19:48:47
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
