package com.winnerwinter.mymall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan("com.winnerwinter.mymall.mbg.mapper")
public class MyBatisConfig {
}
