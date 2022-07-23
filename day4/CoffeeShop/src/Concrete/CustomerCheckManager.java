package Concrete;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisServiceReference.JHLKPSPublicSoap;

public class CustomerCheckManager implements ICustomerCheckService {
    @Override
    public boolean isRealPerson(Customer customer) {

        return false;
    }
}
