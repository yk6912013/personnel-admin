package com.yk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//加载扫描包
@MapperScan(basePackages = "com.yk.mapper")
@EnableScheduling
public class ErpAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpAdminApplication.class, args);
    }

}
