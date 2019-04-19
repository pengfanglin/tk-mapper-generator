package ${package.mapper};

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * MapperFactory工厂
 *
 * @author ${author}
 * @date ${date}
 */
@Component
public class ${mapperFactoryName} {

    <#list tables as table>
    /**
     * ${table.comment!}
     **/
    @Autowired
    public ${table.mapperName} ${table.lowerMapperName};
    </#list>
}
