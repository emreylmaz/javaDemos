import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarBucksCustomerManager;
import Entities.Customer;

public class Main {
    public static  void main(String[] args) throws Exception {
        Customer customer = new Customer();
        customer.setFirstName("Göksel");
        customer.setLastName("Doğan");
        customer.setDateOfBirth(1994);
        customer.setId(1);
        customer.setNationalityId("");




        BaseCustomerManager customerManager = new StarBucksCustomerManager(new CustomerCheckManager());
        customerManager.save(customer);
    }
}