package ${package.controller};

import ${package.core}.Page;
import ${package.core}.Ajax;
import ${package.service}.${table.serviceName};
import ${package.entity}.${table.entityName};
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.beans.factory.annotation.Autowired;
<#if swagger2>
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
</#if>
import org.springframework.web.bind.annotation.RestController;
<#if superControllerClassPackage??>
import ${superControllerClassPackage};
</#if>

/**
 * ${table.comment!} 前端控制器
 *
 * @author ${author}
 * @date ${date}
 */
@RestController
@RequestMapping("/${table.lowerName}/")
<#if swagger2>
@Api(value = "/${table.lowerName}/",description = "${table.comment!}")
</#if>
<#if superControllerClass??>
public class ${table.controllerName} extends ${superControllerClass} {
<#else>
public class ${table.controllerName} {
</#if>

    @Autowired
    ${table.serviceName} ${table.lowerServiceName};

    <#if swagger2>
    @ApiOperation("添加${table.comment!}")
    <#else>
    /**
     * 添加${table.comment!}
     *
     * @param ${table.lowerName}
     * @return
     */
    </#if>
    @PostMapping("insert${table.upperName}")
    Ajax insert${table.upperName}(${table.entityName} ${table.lowerName}) {
        ${table.lowerServiceName}.insert${table.upperName}(${table.lowerName});
        return Ajax.ok();
    }

    <#if swagger2>
    @ApiOperation("删除${table.comment!}")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "${table.idName}", value = "主键", required = true),
    })
    <#else>
    /**
     * 删除${table.comment!}
     *
     * @param ${table.lowerName}
     * @return
     */
    </#if>
    @PostMapping("delete${table.upperName}")
    Ajax delete${table.upperName}(${table.idType} ${table.idName}) {
        ${table.lowerServiceName}.delete${table.upperName}(${table.idName});
        return Ajax.ok();
    }

    <#if swagger2>
    @ApiOperation("修改${table.comment!}")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "${table.idName}", value = "主键", required = true),
    })
    <#else>
    /**
     * 修改${table.comment!}
     *
     * @param ${table.lowerName}
     * @return
     */
    </#if>
    @PostMapping("update${table.upperName}")
    Ajax update${table.upperName}(${table.entityName} ${table.lowerName}) {
        ${table.lowerServiceName}.update${table.upperName}(${table.lowerName});
        return Ajax.ok();
    }

    <#if swagger2>
    @ApiOperation("${table.comment!}详情")
    @ApiImplicitParams({
        @ApiImplicitParam(name = "${table.idName}", value = "主键", required = true),
    })
    <#else>
    /**
     * ${table.comment!}详情
     *
     * @param ${table.lowerName}
     * @return
     */
    </#if>
    @PostMapping("get${table.upperName}Detail")
    Ajax get${table.upperName}Detail(${table.idType} ${table.idName}) {
        return Ajax.ok(${table.lowerServiceName}.get${table.upperName}Detail(${table.idName}));
    }

    <#if swagger2>
    @ApiOperation("${table.comment!}列表")
    <#else>
    /**
     * ${table.comment!}列表
     *
     * @param ${table.lowerName}
     * @page
     * @return
     */
    </#if>
    @PostMapping("get${table.upperName}List")
    Ajax get${table.upperName}List(${table.entityName} ${table.lowerName}, Page page) {
        return Ajax.ok(${table.lowerServiceName}.get${table.upperName}List(${table.lowerName}, page));
    }
}
