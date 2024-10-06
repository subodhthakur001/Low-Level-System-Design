package LLD.Behavioural.Logger;

public class InfoProcessor extends LogProcessor{
    public InfoProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message){
        if(logLevel == INFO){
            System.out.println("DEBUG: " + message);
        }
        else{
            super.log(logLevel,message);
        }
    }
}
