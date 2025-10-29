package com.sirius.zerocodex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(exposeProxy = true)
public class ZeroCodeXApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZeroCodeXApplication.class, args);
	}

}
