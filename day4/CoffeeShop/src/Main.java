import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Adapters.MernisServiceAdapter;
import Concrete.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarBucksCustomerManager;
import Entities.Customer;

public class Main {
    public static  void main(String[] args) throws Exception {
        Customer customer = new Customer();
        customer.setFirstName("Emre");
        customer.setLastName("Yılmaz");
        customer.setDateOfBirth(1998);
        customer.setId(1);
        customer.setNationalityId("");




        BaseCustomerManager customerManager = new StarBucksCustomerManager(new MernisServiceAdapter());
        customerManager.save(customer);
    }
}