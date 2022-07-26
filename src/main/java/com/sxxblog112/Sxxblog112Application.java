package com.sxxblog112;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sxxblog112.mapper")
public class Sxxblog112Application {

    public static void main(String[] args) {
        SpringApplication.run(Sxxblog112Application.class, args);
    }

}
