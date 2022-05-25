package com.yoshiikeda.SimpleLogger;


import java.io.*;


public class ConsoleLogger extends Logger
{
    public static enum Output
    {
        stdout,
        stderr
    }


    private PrintStream _output = null;

    public ConsoleLogger(Log.Severity threshold_)
    {
        this(threshold_, Output.stdout);
    }

    public ConsoleLogger(Log.Severity threshold_, Output output_)
    {
        super(threshold_);

        if (output_ == Output.stdout)
        {
            _output = System.out;
        }
        else if (output_ == Output.stderr)
        {
            _output = System.err;
        }
        else
        {
            // Anomaly
            assert(false);
        }
    }

    @Override
    protected void Log_(String msg_)
    {
        _output.println(msg_);
        _output.flush();
    }
}
