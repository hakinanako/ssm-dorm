package com.hkk.ssm.mapper;

import com.hkk.ssm.pojo.Clazz;
import com.hkk.ssm.pojo.ClazzExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClazzMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    int countByExample(ClazzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    int deleteByExample(ClazzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    int deleteByPrimaryKey(Integer classId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    int insert(Clazz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    int insertSelective(Clazz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    List<Clazz> selectByExample(ClazzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    Clazz selectByPrimaryKey(Integer classId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    int updateByExampleSelective(@Param("record") Clazz record, @Param("example") ClazzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    int updateByExample(@Param("record") Clazz record, @Param("example") ClazzExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    int updateByPrimaryKeySelective(Clazz record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_class
     *
     * @mbggenerated Sun Feb 19 23:02:18 CST 2023
     */
    int updateByPrimaryKey(Clazz record);
}