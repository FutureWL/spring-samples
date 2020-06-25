package io.github.futurewl.data.mongodb.demo1.service;

import org.springframework.stereotype.Service;

@Service
public class RemoteService {

    public String call() {
        return "hello";
    }
}
