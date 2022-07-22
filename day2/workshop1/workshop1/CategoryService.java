package workshop1;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    public void add(Category category){
        System.out.println( category.getName()+"Eklendi");

    }
    public void update(Category category){

        System.out.println( category.getName()+"güncellendi");
    }
    public void delete(Category category){
        System.out.println( category.getName()+"silindi");

    }

    public List<Category>getAll(){
        return new ArrayList<Category>();
    }
}
