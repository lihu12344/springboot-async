package com.example.demo.controller;

import com.example.demo.service.TaskService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private TaskService taskService;

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("开始调用task任务："+System.currentTimeMillis());
        taskService.task();
        System.out.println("task任务调用结束："+System.currentTimeMillis());

        return "success";
    }

    @RequestMapping("/hello2")
    public String hello2(){
        System.out.println("开始调用task2任务："+System.currentTimeMillis());
        taskService.task2();
        System.out.println("task2任务调用结束："+System.currentTimeMillis());

        return "success 2";
    }
}
