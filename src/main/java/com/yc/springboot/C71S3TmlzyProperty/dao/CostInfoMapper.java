package com.yc.springboot.C71S3TmlzyProperty.dao;

import com.yc.springboot.C71S3TmlzyProperty.bean.CostInfo;
import com.yc.springboot.C71S3TmlzyProperty.bean.CostInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CostInfoMapper {
    long countByExample(CostInfoExample example);

    int deleteByExample(CostInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CostInfo record);

    int insertSelective(CostInfo record);

    List<CostInfo> selectByExample(CostInfoExample example);

    CostInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CostInfo record, @Param("example") CostInfoExample example);

    int updateByExample(@Param("record") CostInfo record, @Param("example") CostInfoExample example);

    int updateByPrimaryKeySelective(CostInfo record);

    int updateByPrimaryKey(CostInfo record);
}