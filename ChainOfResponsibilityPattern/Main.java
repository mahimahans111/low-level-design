package ChainOfResponsibilityPattern;

public class Main {
    public static void main(String args[]){
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObject.log(LogProcessor.ERROR, "Encountered validation error");
        logObject.log(LogProcessor.DEBUG, "Debug log" );
        logObject.log(LogProcessor.INFO, "Value of a is 2");
        logObject.log(23, "Haha pranked!");
    }
}
