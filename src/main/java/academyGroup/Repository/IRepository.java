package academyGroup.Repository;

import java.util.List;
import java.util.Map;

/**
 * Generic repository interface for basic CRUD operations.
 */
public interface IRepository<T> {
    Map<Integer, T> getAll();
    T getById(int id);
    void add(T entity);
    void update(T entity);
    void remove(int id);
}
