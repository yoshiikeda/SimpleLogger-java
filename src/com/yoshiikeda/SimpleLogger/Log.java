package com.yoshiikeda.SimpleLogger;


import java.util.*;
import java.time.*;
import java.time.format.*;


public class Log
{
    public enum Severity
    {
        Trace,
        Debug,
        Info,
        Notice,
        Warning,
        Alert,
        Error,
        Critical,
        Emergency
    }


    public static class Loggers
    {
        private static List<Loggable> _loggers = new ArrayList<>();

        private Loggers()
        {
            // Empty
        }

        public static void Add(Loggable logger_)
        {
            _loggers.add(logger_);
        }        

        static void Log(String msg_, Severity severity_) throws Exception
        {
            for (Loggable logger : _loggers)
            {
                logger.Log(msg_, severity_);
            }
        }

        static void Close()
        {
            for (Loggable logger : _loggers)
            {
                logger.Close();
            }

            _loggers.clear();
        }
    }


    private static String LOG_MESSAGE_FORMAT = "[{Timestamp}][{Severity}] {Message}";
    private static String LOG_TIMESTAMP_FORMAT = "yyyy-MM-dd HH:mm:ss.SSS";

    private Log()
    {
        // Empty
    }

    public static void Close()
    {
        Loggers.Close();
    }

    public static void Trace(String msg_) throws Exception
    {
        Write(msg_, Severity.Trace);
    }

    public static void Debug(String msg_) throws Exception
    {
        Write(msg_, Severity.Debug);
    }

    public static void Info(String msg_) throws Exception
    {
        Write(msg_, Severity.Info);
    }

    public static void Notice(String msg_) throws Exception
    {
        Write(msg_, Severity.Notice);
    }

    public static void Warning(String msg_) throws Exception
    {
        Write(msg_, Severity.Warning);
    }

    public static void Alert(String msg_) throws Exception
    {
        Write(msg_, Severity.Alert);
    }

    public static void Error(String msg_) throws Exception
    {
        Write(msg_, Severity.Error);
    }

    public static void Critical(String msg_) throws Exception
    {
        Write(msg_, Severity.Critical);
    }

    public static void Emergency(String msg_) throws Exception
    {
        Write(msg_, Severity.Emergency);
    }

    private static void Write(String msg_, Severity severity_) throws Exception
    {
        Loggers.Log(LOG_MESSAGE_FORMAT.replace("{Timestamp}", DateTimeFormatter.ofPattern(LOG_TIMESTAMP_FORMAT)
                                                                               .format(LocalDateTime.now()))
                                      .replace("{Severity}", severity_.toString())
                                      .replace("{Message}", msg_),
                    severity_);
    }
}