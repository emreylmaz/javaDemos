package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.abstracts.LoggerService;
import nLayeredDemo.core.concretes.jLogServiceAdapter;
import nLayeredDemo.dataAccess.concretes.AbcnateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {


        ProductService productService = new ProductManager(new AbcnateProductDao());

        Product product = new Product(1,2,"Laptop",5000.50,60);
        productService.add(product);

        LoggerService loggerService = new jLogServiceAdapter();
        loggerService.log(product.getName());

    }
}