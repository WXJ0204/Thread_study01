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
public class IDownloader implements Runnable{
    private String url;
    private String fname;

    public IDownloader() {
    }

    
    
    public IDownloader(String url, String fname) {
        this.url = url;
        this.fname = fname;
    }
    
    public void run(){
        WebDownloader downloader = new WebDownloader();
        downloader.downaload(url, fname);
    }
    
    public static void main(String[] args) {
        IDownloader id = new IDownloader("https://gss2.bdstatic.com/9fo3dSag_xI4khGkpoWK1HF6hhy/baike/w%3D268/sign=7852c393572c11dfded1b8255b266255/6a600c338744ebf800c7604fd9f9d72a6059a70f.jpg", "1.jpg");
        IDownloader id2 = new IDownloader("https://gss2.bdstatic.com/9fo3dSag_xI4khGkpoWK1HF6hhy/baike/w%3D268/sign=7852c393572c11dfded1b8255b266255/6a600c338744ebf800c7604fd9f9d72a6059a70f.jpg", "2.jpg");
        Thread t = new Thread(id);
        Thread t1 = new Thread(id2);
        t.start();
        t1.start();
        
    }
    
}
