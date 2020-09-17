package com.rhy;

import com.github.xiaoymin.knife4j.spring.annotations.EnableKnife4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class Knife4jBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(Knife4jBootDemoApplication.class, args);
    }

}
