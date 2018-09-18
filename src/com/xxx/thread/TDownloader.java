/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xxx.thread;

/**
 *
 * @author Administrator
 */
public class TDownloader extends Thread{
    private String url;
    private String name;

    public TDownloader(String url, String name) {
        this.url = url;
        this.name = name;
    }
    
    @Override
    public void run(){
        WebDownloader wd = new WebDownloader();
        wd.downaload(url, name);
        System.out.println(name);
    }
            
    public static void main(String[] args) {
        TDownloader td1 = new TDownloader("https://gss2.bdstatic.com/9fo3dSag_xI4khGkpoWK1HF6hhy/baike/w%3D268/sign=7852c393572c11dfded1b8255b266255/6a600c338744ebf800c7604fd9f9d72a6059a70f.jpg", "1.jpg");
        TDownloader td2 = new TDownloader("https://gss2.bdstatic.com/9fo3dSag_xI4khGkpoWK1HF6hhy/baike/w%3D268/sign=7852c393572c11dfded1b8255b266255/6a600c338744ebf800c7604fd9f9d72a6059a70f.jpg", "2.jpg");
        TDownloader td3 = new TDownloader("https://gss2.bdstatic.com/9fo3dSag_xI4khGkpoWK1HF6hhy/baike/w%3D268/sign=7852c393572c11dfded1b8255b266255/6a600c338744ebf800c7604fd9f9d72a6059a70f.jpg", "3.jpg");
        td1.start();
        td2.start();
        td3.start();
    }
    
}
