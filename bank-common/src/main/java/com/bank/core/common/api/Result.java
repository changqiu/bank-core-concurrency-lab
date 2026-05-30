package com.bank.core.common.api;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    private String code;
    private String message;
    private T data;
    private String traceId;

    public Result() {
    }

    private Result(String code, String message, T data, String traceId) {
        this.code = code;
        this.message = message;
        this.data = data;
        this.traceId = traceId;
    }

    public static <T> Result<T> success() {
        return of(ErrorCode.SUCCESS, null, null);
    }

    public static <T> Result<T> success(T data) {
        return of(ErrorCode.SUCCESS, data, null);
    }

    public static <T> Result<T> fail(ErrorCode errorCode) {
        return of(errorCode, null, null);
    }

    public static <T> Result<T> fail(ErrorCode errorCode, String message) {
        return new Result<T>(errorCode.getCode(), message, null, null);
    }

    public static <T> Result<T> of(ErrorCode errorCode, T data, String traceId) {
        return new Result<T>(errorCode.getCode(), errorCode.getMessage(), data, traceId);
    }

    public boolean isSuccess() {
        return ErrorCode.SUCCESS.getCode().equals(code);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }
}
