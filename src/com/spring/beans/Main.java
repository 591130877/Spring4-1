package com.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//Spring:IOC容器可以帮助我们动态创建对象
public class Main {

	public static void main(String[] args) {
		// 获取容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("xjc.xml");
		// 通过容器对象获取javabean
		Person person1 = (Person) ac.getBean("person1");
		System.out.println(person1);
	}

}
