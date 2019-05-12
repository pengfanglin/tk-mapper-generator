package com.fanglin.tkmapper.generator.config;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 模板路径配置项
 *
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/19 0:14
 **/
@Data
@Accessors(chain = true)
public class TemplateConfig {

    private String entity = ConstVal.TEMPLATE_ENTITY;
    private String model = ConstVal.TEMPLATE_MODEL;

    private String service = ConstVal.TEMPLATE_SERVICE;

    private String serviceImpl = ConstVal.TEMPLATE_SERVICE_IMPL;

    private String mapper = ConstVal.TEMPLATE_MAPPER;
    private String mapperFactory = ConstVal.TEMPLATE_MAPPER_FACTORY;
    private String page = ConstVal.TEMPLATE_PAGE;
    private String pageResult = ConstVal.TEMPLATE_PAGE_RESULT;
    private String ajax = ConstVal.TEMPLATE_AJAX;

    private String controller = ConstVal.TEMPLATE_CONTROLLER;
}
