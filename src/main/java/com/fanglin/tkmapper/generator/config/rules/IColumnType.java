package com.fanglin.tkmapper.generator.config.rules;

/**
 * 获取实体类字段属性类信息接口
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/19 0:12
 **/
public interface IColumnType {

    /**
     * 获取字段类型
     *
     * @return 字段类型
     */
    String getType();

    /**
     * 获取字段类型完整名
     *
     * @return 字段类型完整名
     */
    String getPkg();
}
