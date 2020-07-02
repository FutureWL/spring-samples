package io.github.futurewl.quartz.job;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class MyFirstJob {

    public void sayHello() {
        System.out.println("MyFirstJob:sayHello:" + new Date());
    }
}
