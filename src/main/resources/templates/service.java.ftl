package ${package.service};

import ${package.entity}.${table.entityName};
import ${package.core}.Page;
import ${package.core}.PageResult;

/**
 * ${table.comment!} 服务类
 *
 * @author ${author}
 * @date ${date}
 */
public interface ${table.serviceName} {
    /**
     * 添加${table.comment!}
     *
     * @param ${table.lowerName}
     * @return
     */
    int insert${table.upperName}(${table.entityName} ${table.lowerName});

    /**
     * 通过主键删除${table.comment!}
     *
     * @param ${table.idName} 主键
     * @return
     */
    int delete${table.upperName}(${table.idType} ${table.idName});

    /**
     * 修改${table.comment!}
     *
     * @param ${table.lowerName}
     * @return
     */
    int update${table.upperName}(${table.entityName} ${table.lowerName});

    /**
     * ${table.comment!}详情
     *
     * @param ${table.idName} 主键
     * @return
     */
    ${table.entityName} get${table.upperName}Detail(${table.idType} ${table.idName});

    /**
     * ${table.comment!}列表
     *
     * @param ${table.lowerName}
     * @param page
     * @return
     */
    PageResult<${table.entityName}> get${table.upperName}List(${table.entityName} ${table.lowerName}, Page page);
}
