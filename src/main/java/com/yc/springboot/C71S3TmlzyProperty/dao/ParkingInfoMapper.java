package com.yc.springboot.C71S3TmlzyProperty.dao;

import com.yc.springboot.C71S3TmlzyProperty.bean.ParkingInfo;
import com.yc.springboot.C71S3TmlzyProperty.bean.ParkingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParkingInfoMapper {
    long countByExample(ParkingInfoExample example);

    int deleteByExample(ParkingInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ParkingInfo record);

    int insertSelective(ParkingInfo record);

    List<ParkingInfo> selectByExample(ParkingInfoExample example);

    ParkingInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ParkingInfo record, @Param("example") ParkingInfoExample example);

    int updateByExample(@Param("record") ParkingInfo record, @Param("example") ParkingInfoExample example);

    int updateByPrimaryKeySelective(ParkingInfo record);

    int updateByPrimaryKey(ParkingInfo record);
}