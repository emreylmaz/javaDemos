package Polymorphism;

public class DatabaseLogger extends BaseLogger{
    public void Log(String message){
        System.out.println("Logged to Database: " + message);
    }
}
