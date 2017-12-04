package com.template.rpc.api;

import com.zheng.common.base.BaseServiceMock;
import com.template.dao.mapper.UserMapper;
import com.template.dao.model.User;
import com.template.dao.model.UserExample;

/**
* 降级实现UserService接口
* Created by shuzheng on 2017/12/4.
*/
public class UserServiceMock extends BaseServiceMock<UserMapper, User, UserExample> implements UserService {

}
