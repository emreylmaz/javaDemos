public class ProductManager {
    public  void  add(Product product){
        if (ProductValidator.isValid(product)){ //Static Kullanım newlemedik.
            System.out.println("Eklendi");
        }else {
            System.out.println("Eklenemedi Geçersiz");
        }
    }
}
