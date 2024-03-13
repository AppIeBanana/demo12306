package com.next.common.dao;

import com.next.model.TrainNum;
import com.next.model.TrainNumExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainNumMapper {
    long countByExample(TrainNumExample example);

    int deleteByExample(TrainNumExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrainNum row);

    int insertSelective(TrainNum row);

    List<TrainNum> selectByExample(TrainNumExample example);

    TrainNum selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TrainNum row, @Param("example") TrainNumExample example);

    int updateByExample(@Param("row") TrainNum row, @Param("example") TrainNumExample example);

    int updateByPrimaryKeySelective(TrainNum row);

    int updateByPrimaryKey(TrainNum row);
}