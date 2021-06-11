package com.winnerwinter.mymall.common.api;

public enum ResultCode implements IErrorCode {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数校验失败"),
    UNAUTHORIZED(401, "暂未登录或 token 已经过期"),
    FORBIDDEN(403, "没有相关权限");

    private long statusCode;
    private String message;

    private ResultCode(long statusCode, String message) {
        this.statusCode = statusCode;
        this.message = message;
    }



    @Override
    public long getStatusCode() {
        return statusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
