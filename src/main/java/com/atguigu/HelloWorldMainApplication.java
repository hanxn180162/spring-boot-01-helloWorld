package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author hanxn
 * @date 2018/12/19
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        System.out.println("==========spring boot 启动 start==========");
        SpringApplication.run(HelloWorldMainApplication.class,args);
        System.out.println("==========spring boot 启动 end==========");

    }
}
