package io.github.futurewl.web.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private final RemoteService remoteService;

    public MainService(RemoteService remoteService) {
        this.remoteService = remoteService;
    }

    public void mainService() {
        System.out.println("测试业务方法");
        String result = remoteService.call();
        System.out.println("调用结果：" + result);
    }
}
