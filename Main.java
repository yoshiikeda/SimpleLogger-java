import com.yoshiikeda.SimpleLogger.ConsoleLogger;
import com.yoshiikeda.SimpleLogger.Log;


public class Main
{
    public static void main(String[] args_)
    {
        try
        {
            Log.Info("***** Start *****");
            
            Log.Loggers.Add(new ConsoleLogger(Log.Severity.Info));

            Log.Info("Starting...");
        }
        catch (Exception ex_)
        {
            System.err.println(ex_);
        }
        finally
        {
            Log.Close();
        }
    }    
}
