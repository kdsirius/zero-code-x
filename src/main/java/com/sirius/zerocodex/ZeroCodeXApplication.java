package com.sirius.zerocodex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
@MapperScan("com.sirius.zerocodex.mapper")
public class ZeroCodeXApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeroCodeXApplication.class, args);
	}

}
