package com.sxp.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@Slf4j
public class HelloWorldConfig {
    public HelloWorldConfig(){
        log.info("123");
        System.out.println("123123123123123123");
//        HelloWorldConfiguration2 a = new HelloWorldConfiguration2();
//        a.selectImports();
    }

}
