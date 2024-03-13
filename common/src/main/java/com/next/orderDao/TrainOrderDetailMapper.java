package com.next.common.orderDao;

import com.next.model.TrainOrderDetail;
import com.next.model.TrainOrderDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainOrderDetailMapper {
    long countByExample(TrainOrderDetailExample example);

    int deleteByExample(TrainOrderDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TrainOrderDetail row);

    int insertSelective(TrainOrderDetail row);

    List<TrainOrderDetail> selectByExample(TrainOrderDetailExample example);

    TrainOrderDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("row") TrainOrderDetail row, @Param("example") TrainOrderDetailExample example);

    int updateByExample(@Param("row") TrainOrderDetail row, @Param("example") TrainOrderDetailExample example);

    int updateByPrimaryKeySelective(TrainOrderDetail row);

    int updateByPrimaryKey(TrainOrderDetail row);
}