package com.yoshiikeda.SimpleLogger;


public class MemoryLogger extends Logger
{
    public MemoryLogger(Log.Severity threshold_)
    {
        super(threshold_);
    }

    @Override
    protected void Log_(String msg_) throws Exception
    {
        // TODO: IMPLEMENT
    }
}
