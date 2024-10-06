package LLD.Behavioural.Logger;

public class ErrorProcessor extends LogProcessor{
    public ErrorProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == ERROR){
            System.out.println("DEBUG: " + message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
