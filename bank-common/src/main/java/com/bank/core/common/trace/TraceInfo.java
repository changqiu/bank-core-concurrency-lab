package com.bank.core.common.trace;

import lombok.Data;

/**
 * <p>
 * 线程任务跟踪对象
 * </p>
 *
 * @author sunchangqiu
 * @since 2026/5/30
 */
@Data
public class TraceInfo {
    private String traceId;

    private String requestId;

    private String channelId;

}
