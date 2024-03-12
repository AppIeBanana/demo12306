package com.next.dao;

import com.next.model.TrainUser;
import com.next.model.TrainUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainUserMapper {
    long countByExample(TrainUserExample example);

    int deleteByExample(TrainUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainUser row);

    int insertSelective(TrainUser row);

    List<TrainUser> selectByExample(TrainUserExample example);

    TrainUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") TrainUser row, @Param("example") TrainUserExample example);

    int updateByExample(@Param("row") TrainUser row, @Param("example") TrainUserExample example);

    int updateByPrimaryKeySelective(TrainUser row);

    int updateByPrimaryKey(TrainUser row);
}