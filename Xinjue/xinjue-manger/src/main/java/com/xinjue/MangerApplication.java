package com.xinjue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages="com.xinjue.dao")
@EnableScheduling
@ServletComponentScan //在springBoot启动时会扫描@WebServlet，并将该类实例化  用于生产验证码图片的
public class MangerApplication {
    public static void main(String[] args)
    {
        SpringApplication.run(MangerApplication.class, args);
    }
}
