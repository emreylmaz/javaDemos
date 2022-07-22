package classes;

public class CustomerManager {

    public void add(Customer customer) {
        System.out.println("Customer added: " + customer.getFirstName());

    }
    public void update(Customer customer) {
        System.out.println("Employee updated: "+ customer.getFirstName());


    }
}
