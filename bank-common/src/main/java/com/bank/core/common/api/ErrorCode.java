package com.bank.core.common.api;

public enum ErrorCode {

    SUCCESS("000000", "Success"),
    BAD_REQUEST("400000", "Bad request"),
    UNAUTHORIZED("401000", "Unauthorized"),
    FORBIDDEN("403000", "Forbidden"),
    NOT_FOUND("404000", "Resource not found"),
    SYSTEM_ERROR("500000", "System error"),
    CONCURRENCY_CONFLICT("409000", "Concurrency conflict");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
