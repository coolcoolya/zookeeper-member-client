package com.example.zookeepermemberclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient//如果注册中心使用consul，zookeeper使用@EnableDiscoveryClient向注册中心注册服务
@SpringBootApplication
public class ZookeeperMemberClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperMemberClientApplication.class, args);
    }

}
