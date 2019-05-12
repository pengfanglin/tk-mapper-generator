package com.fanglin.tkmapper.generator.my;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/18 20:26
 **/
@Data
@Accessors(chain = true)
public class PathInfo {
    private String entity;
    private String model;
    private String service;
    private String serviceImpl;
    private String mapper;
    private String page;
    private String pageResult;
    private String controller;
    private String ajax;
}
