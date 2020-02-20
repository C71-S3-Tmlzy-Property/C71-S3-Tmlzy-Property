package com.yc.springboot.C71S3TmlzyProperty.dao;

import com.yc.springboot.C71S3TmlzyProperty.bean.Houses;
import com.yc.springboot.C71S3TmlzyProperty.bean.HousesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HousesMapper {
    long countByExample(HousesExample example);

    int deleteByExample(HousesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Houses record);

    int insertSelective(Houses record);

    List<Houses> selectByExample(HousesExample example);

    Houses selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Houses record, @Param("example") HousesExample example);

    int updateByExample(@Param("record") Houses record, @Param("example") HousesExample example);

    int updateByPrimaryKeySelective(Houses record);

    int updateByPrimaryKey(Houses record);
}