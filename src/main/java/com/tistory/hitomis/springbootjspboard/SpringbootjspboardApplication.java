package com.tistory.hitomis.springbootjspboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * war 배포를 위해 extends SpringBootServletInitializer 상속
 * SpringApplicationBuilder 메소드 구현
 */

@SpringBootApplication
public class SpringbootjspboardApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootjspboardApplication.class, args);
    }
}
