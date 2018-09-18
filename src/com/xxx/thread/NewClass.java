/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xxx.thread;

/**
 *
 * 1、创建：继承Thread+重写run
 *    启动：创建子类对象+start
 * @author Administrator
 */
public class NewClass extends Thread{
    public  void run(){
        for(int i=0;i<200;i++)
        {
            System.out.println("yyyyyyyyyy");
        }
    }
    
    
    public static void main(String[] args) {
        NewClass st = new NewClass();
        st.start();
        
        for(int i=0;i<200;i++)
        {
            System.out.println("xxxxxxx");
        }
    }
}
