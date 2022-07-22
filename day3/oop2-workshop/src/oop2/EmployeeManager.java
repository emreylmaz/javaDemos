package oop2;

public class EmployeeManager  {
	private Logger[] loggers;
	public EmployeeManager(Logger[] loggers) {
		this.loggers=loggers;
	}
	public void add(Employee employee) {
		System.out.println("Employee added");
		for (Logger logger : loggers) {
			logger.log(employee.getFirstName());
		}
	}
	public void update(Employee employee) {
		System.out.println("Employee updated");
		for (Logger logger : loggers) {
			logger.log(employee.getFirstName());
		}
	}
}

//Çoklu loglama imkanı getiriniz...