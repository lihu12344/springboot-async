package com.example.demo.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    public void task(){
        System.out.println("task 开始运行："+System.currentTimeMillis());

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("task 运行结束："+System.currentTimeMillis());
    }

    @Async
    public void task2(){
        System.out.println("task2 开始运行："+System.currentTimeMillis());

        try{
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("task2 运行结束："+System.currentTimeMillis());
    }
}
