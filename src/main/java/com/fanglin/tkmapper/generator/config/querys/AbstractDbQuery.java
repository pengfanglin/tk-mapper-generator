package com.fanglin.tkmapper.generator.config.querys;

import com.fanglin.tkmapper.generator.config.IDbQuery;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 表数据查询抽象类
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/19 0:09
 **/
public abstract class AbstractDbQuery implements IDbQuery {


    @Override
    public boolean isKeyIdentity(ResultSet results) throws SQLException {
        return false;
    }


    @Override
    public String[] fieldCustom() {
        return null;
    }
}
