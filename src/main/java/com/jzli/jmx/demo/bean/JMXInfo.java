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

    @Override
    public String toString() {
        return "JMXInfo{" +
                "VmVendor='" + VmVendor + '\'' +
                ", VmName='" + VmName + '\'' +
                ", VmVersion='" + VmVersion + '\'' +
                ", startTime=" + startTime +
                ", uptime=" + uptime +
                '}';
    }
}
