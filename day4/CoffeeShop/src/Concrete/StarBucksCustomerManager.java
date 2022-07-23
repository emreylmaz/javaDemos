package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.ICustomerCheckService;
import Entities.Customer;

public class StarBucksCustomerManager extends BaseCustomerManager  {
    private final ICustomerCheckService customerCheckService;

    public StarBucksCustomerManager(ICustomerCheckService customerCheckService){
        this.customerCheckService = customerCheckService;

    }

    public void save(Customer customer) throws Exception {
        if (customerCheckService.isRealPerson(customer)){
            System.out.println("Kaydedildi: " + customer.firstName);
        }
        else {
            System.out.println("Gerçek Kişi Değilsiniz.");
        }
    }


}
