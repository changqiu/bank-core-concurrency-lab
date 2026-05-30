package com.bank.core.common.exception;

import com.bank.core.common.api.ErrorCode;

public class BaseException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    private final String code;

    public BaseException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BaseException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

    public BaseException(ErrorCode errorCode, String message, Throwable cause) {
        super(message, cause);
        this.code = errorCode.getCode();
    }

    public String getCode() {
        return code;
    }
}
