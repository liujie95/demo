package com.demo.dao;

import com.demo.domain.OrderDO;

public interface OrderDAO {
    int deleteByPrimaryKey(Long id);

    int insert(OrderDO record);

    int insertSelective(OrderDO record);

    OrderDO selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(OrderDO record);

    int updateByPrimaryKey(OrderDO record);
}