package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration.xml");

        Student stu1 = (Student) context.getBean("student1");
        System.out.println(stu1);
        Student stu2 = (Student) context.getBean("student2");
        System.out.println(stu2);
        /*Student stu3 = (Student) context.getBean("student3");
        System.out.println(stu3);*/
    }
}
