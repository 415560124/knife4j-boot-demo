package com.rhy.knife4jbootdemo.entity;

/**
 * @author Rhy
 * @title 返回信息枚举类
 * @description 返回信息枚举类
 *              _COMMON : 公共返回信息
 *              _{SERVICE-NAME（服务名）}_{ACTION-NAME（方法标题）}
 * @createTime 2020年07月11日 11:59:00
 * @modifier：Rhy
 * @modification_time：2020-07-11 11:59
 */
public enum ResultMessageEnum {
    /**
     * 公共提示
     */
    SUCCESS_COMMON("操作成功"),
    FAILED_COMMON("操作失败"),
    VALIDATE_FAILED_COMMON("参数校验失败"),
    FORBBIDEN_COMMON("没有相关权限"),
    USER_NOT_FOUND("用户不存在"),
    USER_ACCOUNT_ERROR("账号密码错误"),
    GATEWAY_ERROR("网关异常"),
    SERVICE_INSTANCE_NOT_FOUND("未找到服务实例"),
    USER_NOT_LOGIN("用户未登录"),
    VALIDATE_FILE_TYPE_NOT_SUPPORT("文件类型不支持"),
    /**
     * 服务自定义提示
     */
    /**
     * Fol随访服务异常
     */
    FOL_PAT_NOT_FOUND("患者不存在"),
    FOL_ID_NOT_BLACK("所属人ID不能为空"),
    FOL_HEALTH_FILTER_FEIGN_FAIL("随访健康宣教筛选Feign返回异常"),
    FOL_HEALTH_FILTER_PAT_PACKAGE_ERROR("随访服务患者组装信息异常"),
    FOL_ILLEGALITY_SEND_TYPE("患者不存在"),
    /**
     * Pat患者服务异常
     */
    PAT_STATUS_NOT_NULL("状态不能为空"),
    /**
     * 全局异常
     */
    FAILED_FEIGN("Feign调用异常"),
    FAILED_COMMON_SERVER_ERROR("服务端异常"),
    COMMON_AGE_TRANSITION_ERROR("年龄转换错误");


    ResultMessageEnum(String message) {
        this.message = message;
    }

    /**
     * 提示返回信息
     */
    private String message;

    public String getMessage() {
        return message;
    }
}
