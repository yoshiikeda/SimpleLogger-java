package com.yoshiikeda.SimpleLogger;


public abstract class Logger implements Loggable
{
    private Log.Severity _threshold = null;

    public Logger(Log.Severity threshold_)
    {
        _threshold = threshold_;
    }

    public final void Log(String msg_, Log.Severity severity_) throws Exception
    {
        if (_threshold.ordinal() <= severity_.ordinal())
        {
            Log_(msg_);
        }
    }

    public void Close()
    {
        // Empty
    }

    protected abstract void Log_(String msg_) throws Exception;
}
