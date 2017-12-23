package com.itheima.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// 创建Application启动项
//@SpringBootApplication(scanBasePackages={"com.itheima.springboot"})   // 指定扫描的包
@SpringBootApplication //代表为SpringBoot应用的运行主类
public class Application {

	public static void main(String[] args) {
		/**
		 * 运行SpringBoot应用
		 */
		//SpringApplication.run(Application.class, args);
		
		/** 第二种方式：运行SpringBoot应用(去掉Banner) */
		SpringApplication springApplication = 
				new SpringApplication(Application.class);
		/** 设置关闭横幅模式  */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args); 
	}
}
