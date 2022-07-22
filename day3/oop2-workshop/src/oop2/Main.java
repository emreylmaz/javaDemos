package oop2;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = {new ElasticLogger(),new DatabaseLogger(),new CloudLogger()};


		CustomerManager customerManager= new CustomerManager(loggers);
		customerManager.add(new Customer(1,"Emre3","Yılmaz3","1234567809"));
		
		EmployeeManager employeeManager= new EmployeeManager(loggers);
		employeeManager.add(new Employee(1,"Emre","Yılmaz","123456789"));
		employeeManager.add(new Employee(2,"Emre2","Yılmaz2","1234567890"));
	}

}
