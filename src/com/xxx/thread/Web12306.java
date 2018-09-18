/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xxx.thread;

/**
 *共享资源，并发（线程安全）
 * @author Administrator
 */
public class Web12306 implements Runnable{
    //票数
    private int ticketNums = 99;
    @Override
    public void run() {
        while (true) {            
            if(ticketNums<0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"-->"+ticketNums--);
        }
    }
    public static void main(String[] args) {
        //一份资源
        Web12306 web = new Web12306();
        //多个代理
        new Thread(web,"1").start();
        new Thread(web,"2").start();
        new Thread(web,"3").start();
    }
    
}
