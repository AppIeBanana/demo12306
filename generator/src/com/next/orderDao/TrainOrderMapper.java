package com.next.orderDao;

import com.next.model.TrainOrder;
import com.next.model.TrainOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainOrderMapper {
    long countByExample(TrainOrderExample example);

    int deleteByExample(TrainOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainOrder row);

    int insertSelective(TrainOrder row);

    List<TrainOrder> selectByExample(TrainOrderExample example);

    TrainOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") TrainOrder row, @Param("example") TrainOrderExample example);

    int updateByExample(@Param("row") TrainOrder row, @Param("example") TrainOrderExample example);

    int updateByPrimaryKeySelective(TrainOrder row);

    int updateByPrimaryKey(TrainOrder row);
}