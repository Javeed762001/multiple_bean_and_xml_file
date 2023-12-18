package com.ty.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestMultipleConfig {

	public static void main(String[] args) {
		
		ApplicationContext appCont=new ClassPathXmlApplicationContext("my_conf1.xml");
		Student student=(Student) appCont.getBean("myStudent");
		student.run();
		
		ApplicationContext appCont2=new ClassPathXmlApplicationContext("my_conf2.xml");
		Teacher teacher=(Teacher) appCont2.getBean("myTeacher");
		teacher.teach();
	}
}
