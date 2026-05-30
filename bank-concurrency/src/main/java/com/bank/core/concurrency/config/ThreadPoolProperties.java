package com.bank.core.concurrency.config;

/**
 * <p>
 * 线程池配置类
 * </p>
 *
 * @author sunchangqiu
 * @since 2026/5/30
 */
public class ThreadPoolProperties {
    /**
     * 线程池核心线程数
     */
    private int corePoolSize;
    /**
     * 线程池最大线程数
     */
    private int maxPoolSize;
    /**
     * 线程池队列大小
     */
    private int queueCapacity;
    /**
     * 队列存活时间
     */
    private long keepAliveSeconds;

}
