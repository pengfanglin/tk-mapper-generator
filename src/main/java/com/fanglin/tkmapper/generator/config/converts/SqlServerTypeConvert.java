package com.fanglin.tkmapper.generator.config.converts;

import com.fanglin.tkmapper.generator.config.GlobalConfig;
import com.fanglin.tkmapper.generator.config.ITypeConvert;
import com.fanglin.tkmapper.generator.config.rules.DbColumnType;
import com.fanglin.tkmapper.generator.config.rules.IColumnType;

/**
 * SQLServer 字段类型转换
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/19 0:06
 **/
public class SqlServerTypeConvert implements ITypeConvert {

    @Override
    public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
        String t = fieldType.toLowerCase();
        if (t.contains("char") || t.contains("xml")) {
            return DbColumnType.STRING;
        } else if (t.contains("bigint")) {
            return DbColumnType.LONG;
        } else if (t.contains("int")) {
            return DbColumnType.INTEGER;
        } else if (t.contains("date") || t.contains("time")) {
            switch (globalConfig.getDateType()) {
                case ONLY_DATE:
                    return DbColumnType.DATE;
                case SQL_PACK:
                    switch (t) {
                        case "date":
                            return DbColumnType.DATE_SQL;
                        case "time":
                            return DbColumnType.TIME;
                        default:
                            return DbColumnType.TIMESTAMP;
                    }
                case TIME_PACK:
                    switch (t) {
                        case "date":
                            return DbColumnType.LOCAL_DATE;
                        case "time":
                            return DbColumnType.LOCAL_TIME;
                        default:
                            return DbColumnType.LOCAL_DATE_TIME;
                    }
                default:
                    return DbColumnType.DATE;
            }
        } else if (t.contains("text")) {
            return DbColumnType.STRING;
        } else if (t.contains("bit")) {
            return DbColumnType.BOOLEAN;
        } else if (t.contains("decimal") || t.contains("numeric")) {
            return DbColumnType.DOUBLE;
        } else if (t.contains("money")) {
            return DbColumnType.BIG_DECIMAL;
        } else if (t.contains("binary") || t.contains("image")) {
            return DbColumnType.BYTE_ARRAY;
        } else if (t.contains("float") || t.contains("real")) {
            return DbColumnType.FLOAT;
        }
        return DbColumnType.STRING;
    }

}
