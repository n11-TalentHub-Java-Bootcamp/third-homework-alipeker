package com.alipeker.springboot.designpattern.adapter;

public class Socket {

    public void provideElectricity(RunnableWith200 runnableWith200){
        runnableWith200.run();
    }

}
