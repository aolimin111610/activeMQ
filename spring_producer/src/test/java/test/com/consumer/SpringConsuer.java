package test.com.consumer;

import org.apache.xbean.spring.context.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SpringConsuer {

    public static void main(String[] agrs) throws IOException {
        //加在spring配置文件
        ClassPathXmlApplicationContext cxt = new ClassPathXmlApplicationContext("classpath:applicationContext-consumer.xml");
        //启动
        cxt.start();

        //阻塞方法，让程序一直处在等待
        System.in.read();
    }
}
