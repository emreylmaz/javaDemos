package Polymorphism;

public class EmailLogger extends BaseLogger{
    public void Log(String message){
        System.out.println("Logged to File: " + message);
    }
}
