package com.next.common.dao;

import com.next.model.City;
import com.next.model.CityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CityMapper {
    long countByExample(CityExample example);

    int deleteByExample(CityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(City row);

    int insertSelective(City row);

    List<City> selectByExample(CityExample example);

    City selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") City row, @Param("example") CityExample example);

    int updateByExample(@Param("row") City row, @Param("example") CityExample example);

    int updateByPrimaryKeySelective(City row);

    int updateByPrimaryKey(City row);
}