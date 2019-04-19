package ${package.serviceImpl};

import ${package.service}.${table.serviceName};
import ${package.mapper}.${mapperFactoryName};
import ${package.entity}.${table.entityName};
import ${package.core}.Page;
import ${package.core}.PageResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ${table.comment!} 服务实现类
 *
 * @author ${author}
 * @date ${date}
 */
@Service
public class ${table.serviceImplName} implements ${table.serviceName} {
    @Autowired
    MapperFactory mapperFactory;

    @Override
    public int insert${table.upperName}(${table.entityName} ${table.lowerName}) {
        return mapperFactory.${table.lowerMapperName}.insertSelective(${table.lowerName});
    }

    @Override
    public int delete${table.upperName}(${table.idType} ${table.idName}) {
        return mapperFactory.${table.lowerMapperName}.deleteByPrimaryKey(${table.idName});
    }

    @Override
    public int update${table.upperName}(${table.entityName} ${table.lowerName}) {
        return mapperFactory.${table.lowerMapperName}.updateByPrimaryKeySelective(${table.lowerName});
    }

    @Override
    public ${table.entityName} get${table.upperName}Detail(${table.idType} ${table.idName}) {
        return mapperFactory.${table.lowerMapperName}.selectByPrimaryKey(${table.idName});
    }

    @Override
    public PageResult<${table.entityName}> get${table.upperName}List(${table.entityName} ${table.lowerName}, Page page) {
        return new PageResult<>(mapperFactory.${table.lowerMapperName}.selectByRowBounds(${table.lowerName}, page), page.getTotal());
    }
}
