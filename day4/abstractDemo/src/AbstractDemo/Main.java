package AbstractDemo;
public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        //SOLID -> Open close prensibi
        customerManager.databaseManager = new MysqlDatabaseManager();
        customerManager.getCustomers();

    }
}