package com.template.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.template.dao.mapper.OrderMapper;
import com.template.dao.model.Order;
import com.template.dao.model.OrderExample;

/**
* 降级实现OrderService接口
* Created by shuzheng on 2017/12/4.
*/
public class OrderServiceMock extends BaseServiceMock<OrderMapper, Order, OrderExample> implements OrderService {

}
