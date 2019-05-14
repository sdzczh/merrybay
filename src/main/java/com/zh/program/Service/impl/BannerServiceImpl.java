package com.zh.program.Service.impl;

import com.zh.program.Dao.BannerMapper;
import com.zh.program.Entrty.Banner;
import com.zh.program.Service.BannerService;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * 
 * @author: autogeneration
 * @date: 2019-05-08 14:19:04
 **/ 
@Service("bannerService")
public class BannerServiceImpl implements BannerService {
    @Resource
    private BannerMapper bannerMapper;

    private static final Logger logger = LoggerFactory.getLogger(BannerServiceImpl.class);

    @Override
    public int insert(Banner record) {
        return this.bannerMapper.insert(record);
    }

    @Override
    public int insertSelective(Banner record) {
        return this.bannerMapper.insertSelective(record);
    }

    @Override
    public int updateByPrimaryKey(Banner record) {
        return this.bannerMapper.updateByPrimaryKey(record);
    }

    @Override
    public int updateByPrimaryKeySelective(Banner record) {
        return this.bannerMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.bannerMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Banner selectByPrimaryKey(Integer id) {
        return this.bannerMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Banner> selectAll(Map<Object, Object> param) {
        return this.bannerMapper.selectAll(param);
    }

    @Override
    public List<Banner> selectPaging(Map<Object, Object> param) {
        return this.bannerMapper.selectPaging(param);
    }

    @Override
    public int selectCount(Map<Object, Object> param) {
        return this.bannerMapper.selectCount(param);
    }
}