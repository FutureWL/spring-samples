package io.github.futurewl.spring.boot;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 功能描述：Netty 客户端启动类
 *
 * @author weilai create by 2019-07-04:20:44
 * @version 1.0
 */
@SpringBootApplication
public class SpringBoot21NettyClientApplication implements CommandLineRunner {

    private final Bootstrap bootstrap;

    public SpringBoot21NettyClientApplication(Bootstrap bootstrap) {
        this.bootstrap = bootstrap;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot21NettyClientApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Channel channel = bootstrap.connect("localhost", 8888).sync().channel();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {
            channel.writeAndFlush(bufferedReader.readLine() + "\r\n");
        }
    }
}