package com.salesmanager.shop.mapper;

import com.salesmanager.shop.entity.Language;
import com.salesmanager.shop.entity.LanguageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LanguageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    long countByExample(LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    int deleteByExample(LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    int deleteByPrimaryKey(Integer LANGUAGE_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    int insert(Language row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    int insertSelective(Language row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    List<Language> selectByExample(LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    Language selectByPrimaryKey(Integer LANGUAGE_ID);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    int updateByExampleSelective(@Param("row") Language row, @Param("example") LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    int updateByExample(@Param("row") Language row, @Param("example") LanguageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    int updateByPrimaryKeySelective(Language row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LANGUAGE
     *
     * @mbg.generated Sun Jul 30 20:50:06 GMT+08:00 2023
     */
    int updateByPrimaryKey(Language row);
}