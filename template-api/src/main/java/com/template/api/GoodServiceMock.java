package com.template.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.template.dao.mapper.GoodMapper;
import com.template.dao.model.Good;
import com.template.dao.model.GoodExample;

/**
* 降级实现GoodService接口
* Created by shuzheng on 2017/12/4.
*/
public class GoodServiceMock extends BaseServiceMock<GoodMapper, Good, GoodExample> implements GoodService {

}
