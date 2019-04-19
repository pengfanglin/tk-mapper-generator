package com.fanglin.tkmapper.generator.config;

import com.fanglin.tkmapper.generator.config.rules.IColumnType;

/**
 * 数据库字段类型转换
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/19 0:13
 **/
public interface ITypeConvert {


    /**
     * 执行类型转换
     *
     * @param globalConfig 全局配置
     * @param fieldType    字段类型
     * @return ignore
     */
    IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType);
}
