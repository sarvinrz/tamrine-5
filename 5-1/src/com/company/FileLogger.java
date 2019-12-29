package com.company;

public class FileLogger {
    private static FileLogger fileLogger;
    public synchronized static FileLogger getLogInstance(){
        if(fileLogger==null)
        {
            fileLogger=new FileLogger ();
        }
        return fileLogger;
    }
    private FileLogger(){}
    public void show(){
        System.out.println ("job maded !");
    }
}
