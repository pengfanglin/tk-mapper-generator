package com.fanglin.tkmapper.generator.my;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;

/**
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/17 19:53
 **/
public class OthersUtils {
    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(Object object) {
        if (object == null) {
            return true;
        } else if (object instanceof String) {
            return "".equals(object);
        } else if (object.getClass().isArray()) {
            return Array.getLength(object) == 0;
        } else if (object instanceof Collection) {
            return ((Collection) object).isEmpty();
        } else if (object instanceof Map) {
            return ((Map) object).size() == 0;
        } else {
            return false;
        }
    }
}
