package com.jzli.jmx.demo;

import javax.management.MBeanServer;
import javax.management.MBeanServerConnection;
import javax.management.MBeanServerFactory;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

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
    public static void main(String[] args) throws Exception {
        MBeanServer mbs = MBeanServerFactory.newMBeanServer();
        String protocol="jmxmp";
        String host="172.19.60.240";
        int port=9999;
        JMXServiceURL jmxURL = new JMXServiceURL(protocol, host, port);
        JMXConnector jmxc = JMXConnectorFactory.connect(jmxURL, null);
        MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();
    }
}
