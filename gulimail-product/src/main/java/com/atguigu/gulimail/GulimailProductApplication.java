package com.atguigu.gulimail;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 整合mybatisplus
 * 1)导入依赖
 * 2）配置
 *      1、配置数据源
 *          1）导入数据库驱动
 *          2)在application.yml中配置数据源相关信息
 *      2、配置mybatis-plus
 *          1)使用@MapperScan
 *          2)告诉mybatis-plus，sql映射文件位置
 */
@EnableDiscoveryClient
@MapperScan("com.atguigu.gulimail.product.dao")
@SpringBootApplication
public class GulimailProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimailProductApplication.class, args);
    }

}
