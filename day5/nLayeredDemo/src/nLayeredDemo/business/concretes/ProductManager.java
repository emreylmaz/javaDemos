package nLayeredDemo.business.concretes;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.abstracts.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDao productDao;
    private LoggerService loggerService;

    public ProductManager(ProductDao productDao) {
        this.productDao = productDao;
        this.loggerService = loggerService;

    }

    @Override
    public void add(Product product) {
        if (product.getCategoryId()==1){
            System.out.println("Bu kategoride ürün kabul edilmiyor.");
            return;
        }

        this.productDao.add(product);

    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
