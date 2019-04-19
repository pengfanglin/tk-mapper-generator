package ${package.core};

import com.github.pagehelper.PageRowBounds;

import java.io.Serializable;

/**
 * 分页对象
 *
 * @author ${author}
 * @date ${date}
 **/
public class Page extends PageRowBounds implements Serializable {
    public Page(Integer page, Integer limit) {
        super(((page == null ? 1 : page) - 1) * (limit == null ? 10 : limit), limit == null ? 10 : limit);
    }
}
