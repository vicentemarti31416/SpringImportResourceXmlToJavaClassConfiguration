package com.example.importResource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.importResource.bean.BeanTarget;

public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BeanTarget target = context.getBean(BeanTarget.class);
		System.out.println(target);
	}
}
