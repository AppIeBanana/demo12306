package com.next.dao;

import com.next.model.TrainNumDetail;
import com.next.model.TrainNumDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainNumDetailMapper {
    long countByExample(TrainNumDetailExample example);

    int deleteByExample(TrainNumDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TrainNumDetail row);

    int insertSelective(TrainNumDetail row);

    List<TrainNumDetail> selectByExample(TrainNumDetailExample example);

    TrainNumDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") TrainNumDetail row, @Param("example") TrainNumDetailExample example);

    int updateByExample(@Param("row") TrainNumDetail row, @Param("example") TrainNumDetailExample example);

    int updateByPrimaryKeySelective(TrainNumDetail row);

    int updateByPrimaryKey(TrainNumDetail row);
}