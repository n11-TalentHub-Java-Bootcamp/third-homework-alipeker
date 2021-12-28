package com.alipeker.springboot.designpattern.adapter;

public class Iron implements RunnableWith200 {

    @Override
    public void run() {
        System.out.println("Iron works!");
    }
}
