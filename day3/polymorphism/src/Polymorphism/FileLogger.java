package Polymorphism;

public class FileLogger extends BaseLogger {
    public void Log(String message){
        System.out.println("Logged to File: " + message);
    }
}
