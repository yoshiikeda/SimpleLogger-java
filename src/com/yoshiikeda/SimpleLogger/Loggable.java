package com.yoshiikeda.SimpleLogger;


public interface Loggable
{
    public void Log(String msg_, Log.Severity severity_) throws Exception;
    public void Close();   
}