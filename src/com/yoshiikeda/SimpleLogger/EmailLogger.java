package com.yoshiikeda.SimpleLogger;


public class EmailLogger extends Logger
{
    public EmailLogger(Log.Severity threshold_)
    {
        super(threshold_);
    }

    @Override
    protected void Log_(String msg_)
    {
        // TODO: IMPLEMENT
    }
}
