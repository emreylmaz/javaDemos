package Abstract;

import Entities.Customer;

public interface ICustomerCheckService {
    boolean isRealPerson(Customer customer) throws Exception;
}
