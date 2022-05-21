package com.atguigu.gulimail.order.dao;

import com.atguigu.gulimail.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lishihao
 * @email 861289310@qq.com
 * @date 2022-05-21 19:57:13
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
