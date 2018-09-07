package com.cofar.hermes.core.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/*
public class MyBatisConfig {

}
*/

/**
*
* @author Alvaro
*/
@Configuration
@ImportResource(value = "classpath:mybatisContext.xml")
//@MapperScan("com.cofar.hermes.kardex.repository")
//@MapperScan("com.cofar.hermes")
public class MyBatisConfig {
   
}

