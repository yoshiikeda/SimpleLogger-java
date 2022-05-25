package com.yoshiikeda.SimpleLogger;


import java.io.*;
import java.nio.file.*;


public class FileLogger extends Logger
{
    protected FileSystem SYSTEM = FileSystems.getDefault();
    protected Path PATH = null;

    public FileLogger(Log.Severity threshold_, String file_)
    {
        super(threshold_);

        PATH = SYSTEM.getPath(file_);
    }
    
    public void Close()
    {

    }

    @Override
    protected void Log_(String msg_) throws IOException
    {

    }
}