package Polymorphism;



public class BaseLogger {
    public void Log(String message){
        BaseLogger[] loggers =new BaseLogger[] {new FileLogger(),new  EmailLogger(), new DatabaseLogger()};
        for (BaseLogger logger:loggers){
            logger.Log("Log mesajı");
        }


    }
}
