package ${package.entity};

<#list table.importPackages as pkg>
import ${pkg};
</#list>
<#if swagger2>
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
</#if>
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * ${table.comment!}
 *
 * @author ${author}
 * @date ${date}
 */
@Data
    <#if superEntityClass??>
@EqualsAndHashCode(callSuper = true)
    <#else>
@EqualsAndHashCode(callSuper = false)
    </#if>
@Accessors(chain = true)
@Table(name = "${table.name}")
<#if swagger2>
@ApiModel(value = "${table.entityName}对象", description = "${table.comment!}")
</#if>
<#if superEntityClass??>
public class ${table.entityName} extends ${superEntityClass} {
<#else>
public class ${table.entityName} implements Serializable {
</#if>
<#list table.fields as field>

    <#if field.keyFlag>
        <#assign keyPropertyName="${field.propertyName}"/>
    </#if>
    <#if field.comment!?length gt 0>
        <#if swagger2>
    @ApiModelProperty(value = "${field.comment}")
        <#else>
    /**
    * ${field.comment}
    */
        </#if>
    </#if>
    <#if field.keyFlag>
    <#-- 主键 -->
        <#if field.keyIdentityFlag>
    @Id
    @KeySql(useGeneratedKeys = true)
        <#else>
    @Id
        </#if>
    </#if>
    private ${field.propertyType} ${field.propertyName};
</#list>
}
