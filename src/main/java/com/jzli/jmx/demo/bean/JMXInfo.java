package com.jzli.jmx.demo.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * =======================================================
 *
 * @Company 产品技术部
 * @Date ：2017/10/18
 * @Author ：李金钊
 * @Version ：0.0.1
 * @Description ：
 * ========================================================
 */
public class JMXInfo implements Serializable {
    /**
     * 厂家
     */
    private String VmVendor;
    /**
     * 程序名
     */
    private String VmName;
    /**
     * 版本
     */
    private String VmVersion;
    /**
     * 启动时间
     */
    private Date startTime;
    /**
     * 持续时间
     */
    private Long uptime;
    /**
     * 堆内存使用量(bytes)
     */
    private Long usedHeapMemory;
    /**
     * 堆内存最大值(bytes)
     */
    private Long maxHeapMemory;
    /**
     * 堆内存分配值(bytes)
     */
    private Long committedHeapMemory;
    /**
     * 栈内存使用量(bytes)
     */
    private Long usedNonHeapMemory;
    /**
     * 栈内存最大值(bytes)
     */
    private Long maxNonHeapMemory;
    /**
     * 栈内存分配值(bytes)
     */
    private Long committedNonHeapMemory;
    /**
     * 线程数
     */
    private Integer threadCount;

    public String getVmVendor() {
        return VmVendor;
    }

    public void setVmVendor(String vmVendor) {
        VmVendor = vmVendor;
    }

    public String getVmName() {
        return VmName;
    }

    public void setVmName(String vmName) {
        VmName = vmName;
    }

    public String getVmVersion() {
        return VmVersion;
    }

    public void setVmVersion(String vmVersion) {
        VmVersion = vmVersion;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Long getUptime() {
        return uptime;
    }

    public void setUptime(Long uptime) {
        this.uptime = uptime;
    }

    public Long getUsedHeapMemory() {
        return usedHeapMemory;
    }

    public void setUsedHeapMemory(Long usedHeapMemory) {
        this.usedHeapMemory = usedHeapMemory;
    }

    public Long getMaxHeapMemory() {
        return maxHeapMemory;
    }

    public void setMaxHeapMemory(Long maxHeapMemory) {
        this.maxHeapMemory = maxHeapMemory;
    }

    public Long getCommittedHeapMemory() {
        return committedHeapMemory;
    }

    public void setCommittedHeapMemory(Long committedHeapMemory) {
        this.committedHeapMemory = committedHeapMemory;
    }

    public Long getUsedNonHeapMemory() {
        return usedNonHeapMemory;
    }

    public void setUsedNonHeapMemory(Long usedNonHeapMemory) {
        this.usedNonHeapMemory = usedNonHeapMemory;
    }

    public Long getMaxNonHeapMemory() {
        return maxNonHeapMemory;
    }

    public void setMaxNonHeapMemory(Long maxNonHeapMemory) {
        this.maxNonHeapMemory = maxNonHeapMemory;
    }

    public Long getCommittedNonHeapMemory() {
        return committedNonHeapMemory;
    }

    public void setCommittedNonHeapMemory(Long committedNonHeapMemory) {
        this.committedNonHeapMemory = committedNonHeapMemory;
    }

    public Integer getThreadCount() {
        return threadCount;
    }

    public void setThreadCount(Integer threadCount) {
        this.threadCount = threadCount;
    }

    @Override
    public String toString() {
        return "JMXInfo{" +
                "VmVendor='" + VmVendor + '\'' +
                ", VmName='" + VmName + '\'' +
                ", VmVersion='" + VmVersion + '\'' +
                ", startTime=" + startTime +
                ", uptime=" + uptime +
                ", usedHeapMemory=" + usedHeapMemory +
                ", maxHeapMemory=" + maxHeapMemory +
                ", committedHeapMemory=" + committedHeapMemory +
                ", usedNonHeapMemory=" + usedNonHeapMemory +
                ", maxNonHeapMemory=" + maxNonHeapMemory +
                ", committedNonHeapMemory=" + committedNonHeapMemory +
                ", threadCount=" + threadCount +
                '}';
    }
}
