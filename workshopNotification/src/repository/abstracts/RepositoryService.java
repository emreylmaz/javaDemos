package repository.abstracts;

import java.util.List;

public interface RepositoryService<T> {
    List<T> getAll();
    void add(T entity);
}
