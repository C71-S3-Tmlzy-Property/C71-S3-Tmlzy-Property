package com.yc.springboot.C71S3TmlzyProperty.dao;

import com.yc.springboot.C71S3TmlzyProperty.bean.Units;
import com.yc.springboot.C71S3TmlzyProperty.bean.UnitsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UnitsMapper {
    long countByExample(UnitsExample example);

    int deleteByExample(UnitsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Units record);

    int insertSelective(Units record);

    List<Units> selectByExample(UnitsExample example);

    Units selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Units record, @Param("example") UnitsExample example);

    int updateByExample(@Param("record") Units record, @Param("example") UnitsExample example);

    int updateByPrimaryKeySelective(Units record);

    int updateByPrimaryKey(Units record);
}