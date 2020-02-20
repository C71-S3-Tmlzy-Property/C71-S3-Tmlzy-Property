package com.yc.springboot.C71S3TmlzyProperty.dao;

import com.yc.springboot.C71S3TmlzyProperty.bean.Villages;
import com.yc.springboot.C71S3TmlzyProperty.bean.VillagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VillagesMapper {
    long countByExample(VillagesExample example);

    int deleteByExample(VillagesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Villages record);

    int insertSelective(Villages record);

    List<Villages> selectByExample(VillagesExample example);

    Villages selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Villages record, @Param("example") VillagesExample example);

    int updateByExample(@Param("record") Villages record, @Param("example") VillagesExample example);

    int updateByPrimaryKeySelective(Villages record);

    int updateByPrimaryKey(Villages record);
}