package com.packagee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Singleton {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
      
      SingletonEmp emp=(SingletonEmp)context.getBean("helloWorld");
      emp.setGender("female");
      emp.setName("shruti");
      emp.display();
      System.out.println("no of obj created:"+SingletonEmp.count);
   }
}