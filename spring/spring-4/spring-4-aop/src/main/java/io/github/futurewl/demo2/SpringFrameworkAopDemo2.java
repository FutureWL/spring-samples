package io.github.futurewl.demo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-07:19:41
 * @version 1.0
 */
public class SpringFrameworkAopDemo2 {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("aop/AopBeans2.xml");
        Student student = (Student) context.getBean("student");
        student.getName();
        student.getAge();
        student.printThrowException();
    }
}