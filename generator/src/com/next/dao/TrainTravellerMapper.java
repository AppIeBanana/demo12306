package com.next.dao;

import com.next.model.TrainTraveller;
import com.next.model.TrainTravellerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainTravellerMapper {
    long countByExample(TrainTravellerExample example);

    int deleteByExample(TrainTravellerExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainTraveller row);

    int insertSelective(TrainTraveller row);

    List<TrainTraveller> selectByExample(TrainTravellerExample example);

    TrainTraveller selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") TrainTraveller row, @Param("example") TrainTravellerExample example);

    int updateByExample(@Param("row") TrainTraveller row, @Param("example") TrainTravellerExample example);

    int updateByPrimaryKeySelective(TrainTraveller row);

    int updateByPrimaryKey(TrainTraveller row);
}