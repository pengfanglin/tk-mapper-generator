package com.fanglin.tkmapper.generator.config;

import com.fanglin.tkmapper.generator.config.po.TableInfo;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 输出文件配置
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/19 0:13
 **/
@Data
@Accessors(chain = true)
public abstract class AbstractFileOutConfig {

    /**
     * 模板
     */
    private String templatePath;

    public AbstractFileOutConfig() {
        // to do nothing
    }

    public AbstractFileOutConfig(String templatePath) {
        this.templatePath = templatePath;
    }

    /**
     * 输出文件
     * @param tableInfo
     * @return
     */
    public abstract String outputFile(TableInfo tableInfo);
}
