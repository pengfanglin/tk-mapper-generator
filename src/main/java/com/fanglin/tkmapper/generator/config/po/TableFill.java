package com.fanglin.tkmapper.generator.config.po;

import com.fanglin.tkmapper.generator.my.FieldFill;
import lombok.Data;

/**
 * 字段填充
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/19 0:08
 **/
@Data
public class TableFill {

    /**
     * 字段名称
     */
    private String fieldName;
    /**
     * 忽略类型
     */
    private FieldFill fieldFill;

    public TableFill(String fieldName, FieldFill ignore) {
        this.fieldName = fieldName;
        this.fieldFill = ignore;
    }
}
