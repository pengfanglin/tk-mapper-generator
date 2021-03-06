package com.fanglin.tkmapper.generator.my;

/**
 * @author 彭方林
 * @version 1.0
 * @date 2019/4/17 19:50
 **/
public final class ExceptionUtils {

    private ExceptionUtils() {
    }

    /**
     * 返回一个新的异常，统一构建，方便统一处理
     *
     * @param msg 消息
     * @param t   异常信息
     * @return 返回异常
     */
    public static RuntimeException mpe(String msg, Throwable t, Object... params) {
        return new RuntimeException(StringUtils.format(msg, params), t);
    }

    /**
     * 重载的方法
     *
     * @param msg 消息
     * @return 返回异常
     */
    public static RuntimeException mpe(String msg, Object... params) {
        return new RuntimeException(StringUtils.format(msg, params));
    }

    /**
     * 重载的方法
     *
     * @param t 异常
     * @return 返回异常
     */
    public static RuntimeException mpe(Throwable t) {
        return new RuntimeException(t);
    }

}
