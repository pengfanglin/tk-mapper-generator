package com.fanglin.tkmapper.generator.engine;

import com.fanglin.tkmapper.generator.config.ConstVal;
import com.fanglin.tkmapper.generator.config.builder.ConfigBuilder;
import com.fanglin.tkmapper.generator.my.StringPool;
import freemarker.template.Configuration;
import freemarker.template.Template;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Map;

/**
 * Freemarker 模板引擎实现文件输出
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/19 0:15
 **/
public class FreemarkerTemplateEngine extends AbstractTemplateEngine {

    private Configuration configuration;

    @Override
    public FreemarkerTemplateEngine init(ConfigBuilder configBuilder) {
        super.init(configBuilder);
        configuration = new Configuration(Configuration.DEFAULT_INCOMPATIBLE_IMPROVEMENTS);
        configuration.setDefaultEncoding(ConstVal.UTF8);
        configuration.setClassForTemplateLoading(FreemarkerTemplateEngine.class, StringPool.SLASH);
        return this;
    }


    @Override
    public void writer(Map<String, Object> objectMap, String templatePath, String outputFile){
        try (FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {
            Template template = configuration.getTemplate(templatePath);
            template.process(objectMap, new OutputStreamWriter(fileOutputStream, ConstVal.UTF8));
        }catch (Exception e){
            throw new RuntimeException("文件写入失败");
        }
        logger.debug("模板:" + templatePath + ";  文件:" + outputFile);
    }


    @Override
    public String templateFilePath(String filePath) {
        return filePath + ".ftl";
    }
}
