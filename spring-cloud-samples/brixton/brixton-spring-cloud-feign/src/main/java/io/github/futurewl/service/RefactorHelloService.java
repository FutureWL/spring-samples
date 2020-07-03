package io.github.futurewl.scs.f.service;


import io.github.futurewl.scs.f.service.didi.HelloService;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient(value = "hello-service")
public interface RefactorHelloService extends HelloService {
}
