package com.isntyet.test.aws.xray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class XrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(XrayApplication.class, args);
	}

}
