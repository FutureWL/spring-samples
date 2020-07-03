package io.github.futurewl.web.test.service;

import org.springframework.stereotype.Service;

@Service
public class RemoteService {
    public String call() {
        return "hello";
    }
}
