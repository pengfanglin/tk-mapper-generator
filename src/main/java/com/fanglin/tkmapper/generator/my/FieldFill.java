package com.fanglin.tkmapper.generator.my;

/**
 * 字段填充策略枚举类
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/19 0:15
 **/
public enum FieldFill {
    /**
     * 默认不处理
     */
    DEFAULT,
    /**
     * 插入时填充字段
     */
    INSERT,
    /**
     * 更新时填充字段
     */
    UPDATE,
    /**
     * 插入和更新时填充字段
     */
    INSERT_UPDATE
}
