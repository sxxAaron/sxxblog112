package com.sxxblog112.service.impl;

import com.sxxblog112.entity.User;
import com.sxxblog112.mapper.UserMapper;
import com.sxxblog112.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户id
用户名
 服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-07-26
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
