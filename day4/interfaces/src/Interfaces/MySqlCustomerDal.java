package Interfaces;

public class MySqlCustomerDal implements ICustomerDal {
    @Override
    public void add() {
        System.out.println("MySql Eklendi.");
    }
}
