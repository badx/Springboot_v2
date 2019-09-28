package com.fc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 项目启动方法
 * @author fuce
 *
 */
@SpringBootApplication
@MapperScan(value = "com.fc.test.mapper")
public class SpringbootStart {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootStart.class, args);
        
    }
}
