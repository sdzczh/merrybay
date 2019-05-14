package com.zh.program.Dao;

import com.zh.program.Entrty.Banner;
import java.util.List;
import java.util.Map;

public interface BannerMapper {
    int insert(Banner record);

    int insertSelective(Banner record);

    int updateByPrimaryKey(Banner record);

    int updateByPrimaryKeySelective(Banner record);

    int deleteByPrimaryKey(Integer id);

    Banner selectByPrimaryKey(Integer id);

    List<Banner> selectAll(Map<Object, Object> param);

    List<Banner> selectPaging(Map<Object, Object> param);

    int selectCount(Map<Object, Object> param);
}