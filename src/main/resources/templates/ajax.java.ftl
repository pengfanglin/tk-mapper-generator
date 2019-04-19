package ${package.core};

import lombok.Data;
import lombok.experimental.Accessors;

/**
* ajax返回结果
*
* @author ${author}
* @date ${date}
*/
@Data
@Accessors(chain = true)
public class Ajax<T> {
    /**
    * 状态码  200:成功  400:失败 202:等待中 401:未授权 403:权限不足
    */
    private Integer status;
    /**
    * 错误信息
    */
    private String error;
    /**
    * 结果集
    */
    private T data;

    public static Ajax ok() {
        Ajax<String> ajax = new Ajax<>();
        ajax.setStatus(200);
        ajax.setData("操作成功");
        return ajax;
    }

    public static <T> Ajax<T> ok(T object) {
        Ajax<T> ajax = new Ajax<>();
        ajax.setStatus(200);
        ajax.setData(object);
        return ajax;
    }

    public static Ajax error() {
        Ajax<String> ajax = new Ajax<>();
        ajax.setStatus(400);
        ajax.setData("操作失败");
        return ajax;
    }

    public static Ajax error(String error) {
        Ajax ajax = new Ajax<>();
        ajax.setStatus(400).setError(error);
        return ajax;
    }

    public static <T> Ajax<T> status(Integer status) {
        Ajax<T> ajax = new Ajax<>();
        ajax.setStatus(status);
        return ajax;
    }

    public static Ajax status(Integer status, String error) {
        Ajax ajax = new Ajax();
        ajax.setStatus(status).setError(error);
        return ajax;
    }

    public static Ajax pending(String error) {
        Ajax ajax = new Ajax();
        ajax.setStatus(202).setError(error);
        return ajax;
    }
}

