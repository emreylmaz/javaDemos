package oop2;

public class CustomerManager {
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		this.loggers=loggers;
	}
	public void add(Customer customer) {
		System.out.println("Customer added");
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}
	}
	public void update(Customer customer) {
		System.out.println("Employee updated");
		for (Logger logger : loggers) {
			logger.log(customer.getFirstName());
		}

	}
}
//SOLID 
//Single responsibility Principle
//Open Closed Principle