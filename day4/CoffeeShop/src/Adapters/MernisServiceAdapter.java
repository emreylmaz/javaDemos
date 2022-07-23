package Adapters;

import Abstract.ICustomerCheckService;
import Entities.Customer;
import MernisServiceReference.JHLKPSPublicSoap;

public class MernisServiceAdapter implements ICustomerCheckService {

    @Override
    public boolean isRealPerson(Customer customer) throws Exception {
        JHLKPSPublicSoap client = new JHLKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.nationalityId),customer.firstName.toUpperCase(),customer.lastName.toUpperCase(),customer.dateOfBirth);
    }
}
