package com.atguigu.gulimail.coupon.dao;

import com.atguigu.gulimail.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lishihao
 * @email 861289310@qq.com
 * @date 2022-05-20 05:49:04
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
