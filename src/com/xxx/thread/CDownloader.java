/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xxx.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 *
 * @author Administrator
 */
public class CDownloader implements Callable{

    private String url;
    private String name;

    public CDownloader(String url, String name) {
        this.url = url;
        this.name = name;
    }
    
    
    
    @Override
    public Boolean call() throws Exception {
      WebDownloader wd = new WebDownloader();
      wd.downaload(url, name);
        System.out.println(name);
        return true;
    }
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CDownloader cd1 = new CDownloader("https://gss2.bdstatic.com/9fo3dSag_xI4khGkpoWK1HF6hhy/baike/w%3D268/sign=7852c393572c11dfded1b8255b266255/6a600c338744ebf800c7604fd9f9d72a6059a70f.jpg", "1.jpg");
        CDownloader cd2 = new CDownloader("https://gss2.bdstatic.com/9fo3dSag_xI4khGkpoWK1HF6hhy/baike/w%3D268/sign=7852c393572c11dfded1b8255b266255/6a600c338744ebf800c7604fd9f9d72a6059a70f.jpg", "2.jpg");
        
        //创建执行服务
        ExecutorService ser= Executors.newFixedThreadPool(2);
        //提交执行
        Future<Boolean> result1 = ser.submit(cd1);
        Future<Boolean> result2 = ser.submit(cd2);
        
        boolean r1 = result1.get();
        boolean r2 = result2.get();
        
        ser.shutdownNow();
    }
    
}
