package com.fanglin.tkmapper.generator.config;

import com.fanglin.tkmapper.generator.config.builder.ConfigBuilder;
import com.fanglin.tkmapper.generator.my.PackageHelper;

import java.io.File;

/**
 *文件覆盖接口
 * @author 彭方林
 * @date 2019/4/19 0:14
 * @version 1.0
 **/
public interface IFileCreate {

    /**
     * 自定义判断是否创建文件
     *
     * @param configBuilder 配置构建器
     * @param fileType      文件类型
     * @param filePath      文件路径
     * @return ignore
     */
    boolean isCreate(ConfigBuilder configBuilder, String filePath);

    /**
     * 检查文件目录，不存在自动递归创建
     *
     * @param filePath 文件路径
     */
    default void checkDir(String filePath) {
        File file = new File(filePath);
        boolean exist = file.exists();
        if (!exist) {
            PackageHelper.mkDir(file.getParentFile());
        }
    }
}
