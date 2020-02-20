package com.yc.springboot.C71S3TmlzyProperty;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yc.springboot.C71S3TmlzyProperty")
public class C71TmlzyPropertyApplication {

	public static void main(String[] args) {
		SpringApplication.run(C71TmlzyPropertyApplication.class, args);
	}

}
