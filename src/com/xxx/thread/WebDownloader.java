/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xxx.thread;
import com.sun.org.apache.xerces.internal.util.URI;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import  org.apache.commons.io.FileUtils;


/**
 *
 * @author Administrator
 */
public class WebDownloader {
    public void downaload(String url,String name){
        try {
            FileUtils.copyURLToFile(new URL(url), new File(name));
        } catch (MalformedURLException e) {
            System.out.println("不合法的url");
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("下载失败");
        }
        
        
    }
}
