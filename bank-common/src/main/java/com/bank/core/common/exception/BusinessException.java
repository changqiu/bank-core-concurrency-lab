package com.bank.core.common.exception;

import lombok.Data;

/**
 * <p>
 * 业务异常对象
 * </p>
 *
 * @author sunchangqiu
 * @since 2026/5/30
 */
@Data
public class BusinessException extends RuntimeException{
    /**
     * 异常返回码
     */
    private String errorCode;
    /**
     * 异常返回消息
     */
    private String errorMessage;
}
