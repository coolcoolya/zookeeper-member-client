package com.example.zookeepermemberclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @RequestMapping("/getZookeeperMember")
    public String getZookeeperMember(){
        return "zookeeper member";
    }
}
