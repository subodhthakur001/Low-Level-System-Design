package LLD.Behavioural.Logger;

public class DebugLogger extends LogProcessor{
    public DebugLogger(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == DEBUG){
            System.out.println("DEBUG: " + message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
