package com.sxxblog112.service.impl;

import com.sxxblog112.entity.Ad;
import com.sxxblog112.mapper.AdMapper;
import com.sxxblog112.service.IAdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jobob
 * @since 2022-07-26
 */
@Service
public class AdServiceImpl extends ServiceImpl<AdMapper, Ad> implements IAdService {

}
