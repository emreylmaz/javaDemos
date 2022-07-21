public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Dell Laptop");
        product.setPrice(5000);
        product.setStockAmount(5000);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getCode());





    }
}