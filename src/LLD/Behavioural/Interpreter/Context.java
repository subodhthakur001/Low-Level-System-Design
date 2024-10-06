package LLD.Behavioural.Interpreter;

import java.util.HashMap;
import java.util.Map;

public class Context {
    Map<String, Integer> contextMap = new HashMap<>();

    public void put(String strvariable, int intValue){
        contextMap.put(strvariable,intValue);
    }

    public int get(String strvariable){
        return contextMap.get(strvariable);
    }
}
