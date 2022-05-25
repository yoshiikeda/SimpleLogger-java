package com.yoshiikeda.SimpleLogger;


public class NullLogger extends Logger
{
    public NullLogger(Log.Severity threshold_)
    {
        super(threshold_);
    }

    protected void Log_(String msg_) throws Exception
    {
        // Empty
    }
}