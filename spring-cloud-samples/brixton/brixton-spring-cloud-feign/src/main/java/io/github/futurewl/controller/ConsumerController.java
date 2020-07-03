package io.github.futurewl.scs.f.controller;

import io.github.futurewl.dto.User;
import io.github.futurewl.scs.f.service.HelloService;
import io.github.futurewl.scs.f.service.RefactorHelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @author weilai create by 2019-06-06:17:17
 * @version 1.0
 */
@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @Autowired
    RefactorHelloService refactorHelloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        return helloService.hello() + "\n" +
                helloService.hello("DIDI") + "\n" +
                helloService.hello("DIDI", 30) + "\n" +
                helloService.hello(new User("DIDI", 30)) + "\n";
    }

    @RequestMapping(value = "/feign-consumer3", method = RequestMethod.GET)
    public String helloConsumer3() {
        return refactorHelloService.hello("MIMI") + "\n" +
                refactorHelloService.hello("MIMI", 20) + "\n" +
                refactorHelloService.hello(new User("MIMI", 20)) + "\n";
    }

}
