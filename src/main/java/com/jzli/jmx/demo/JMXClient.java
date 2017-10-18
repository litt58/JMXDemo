package com.jzli.jmx.demo;


import com.jzli.jmx.demo.bean.JMXInfo;

import javax.management.*;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

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
public class JMXClient {
    private SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private Formatter formatter = new Formatter();

    public void start() throws AttributeNotFoundException, MBeanException, ReflectionException, InstanceNotFoundException, IOException, MalformedObjectNameException {
        String protocol = "jmxmp";
        String host = "172.19.60.240";
        int port = 9999;
        JMXServiceURL jmxURL = new JMXServiceURL(protocol, host, port);
        JMXConnector jmxc = JMXConnectorFactory.connect(jmxURL);
        MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();
        ObjectName runtimeObjName = new ObjectName("java.lang:type=Runtime");

        JMXInfo jmxInfo = new JMXInfo();

        String vmVendor = (String) mbsc.getAttribute(runtimeObjName, "VmVendor");
        String vmVersion = (String) mbsc.getAttribute(runtimeObjName, "VmVersion");
        String vmName = (String) mbsc.getAttribute(runtimeObjName, "VmName");
        Date startTime = new Date((Long) mbsc.getAttribute(runtimeObjName, "StartTime"));
        Long timeSpan = (Long) mbsc.getAttribute(runtimeObjName, "Uptime");
        String uptime = formatTimeSpan(timeSpan);

        jmxInfo.setVmVendor(vmVendor);
        jmxInfo.setVmName(vmName);
        jmxInfo.setVmVersion(vmVersion);
        jmxInfo.setStartTime(startTime);
        jmxInfo.setUptime(timeSpan);
        System.out.println(jmxInfo);

        System.out.println("厂商:" + vmVendor);
        System.out.println("程序:" + vmName);
        System.out.println("版本:" + vmVersion);
        System.out.println("启动时间:" + df.format(startTime));
        System.out.println("连续工作时间:" + uptime);
    }

    public static void main(String[] args) throws Exception {
        new JMXClient().start();
    }

    /**
     * 格式化时间
     *
     * @param span
     * @return
     */
    private String formatTimeSpan(long span) {
        long minseconds = span % 1000;

        span = span / 1000;
        long seconds = span % 60;

        span = span / 60;
        long mins = span % 60;

        span = span / 60;
        long hours = span % 24;

        span = span / 24;
        long days = span;
        return formatter.format("%1$d天 %2$02d:%3$02d:%4$02d.%5$03d",
                days, hours, mins, seconds, minseconds).toString();
    }
}
