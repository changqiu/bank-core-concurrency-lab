package com.bank.core.concurrency.monitor;

/**
 * <p>
 * 线程池监控对象
 * </p>
 *
 * @author sunchangqiu
 * @since 2026/5/30
 */
public class ThreadPoolMonitor {
    /**
     * 活跃任务数
     */
    private int activeCount;
    /**
     * 已计算任务数
     */
    private int completedTaskCount;
    /**
     * 队列大小
     */
    private int queueSize;
    /**
     * 线程池最大存活数
     */
    private int largestPoolSize;
}
