package com.fanglin.tkmapper.generator.config;


import com.fanglin.tkmapper.generator.my.PathInfo;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 跟包相关的配置项
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/19 0:14
 **/

@Data
@Accessors(chain = true)
public class PackageConfig {

    /**
     * 父包名。如果为空,则生成到项目包 根目录
     */
    private String parent = "";
    /**
     * Entity包名
     */
    private String entity = "entity";
    /**
     * Service包名
     */
    private String service = "service";
    /**
     * Service Impl包名
     */
    private String serviceImpl = "service.impl";
    /**
     * Mapper包名
     */
    private String mapper = "mapper";
    /**
     * Controller包名
     */
    private String controller = "controller";
    /**
     * 核心对象包名
     */
    private String core = "core";
    /**
     * 路径配置信息
     */
    private PathInfo pathInfo;
}
