package com.yc.springboot.C71S3TmlzyProperty.dao;

import com.yc.springboot.C71S3TmlzyProperty.bean.HousingInfo;
import com.yc.springboot.C71S3TmlzyProperty.bean.HousingInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HousingInfoMapper {
    long countByExample(HousingInfoExample example);

    int deleteByExample(HousingInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HousingInfo record);

    int insertSelective(HousingInfo record);

    List<HousingInfo> selectByExample(HousingInfoExample example);

    HousingInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HousingInfo record, @Param("example") HousingInfoExample example);

    int updateByExample(@Param("record") HousingInfo record, @Param("example") HousingInfoExample example);

    int updateByPrimaryKeySelective(HousingInfo record);

    int updateByPrimaryKey(HousingInfo record);
}