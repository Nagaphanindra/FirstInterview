package model;

import java.io.Serializable;
import java.util.List;

public interface BaseDal<E extends BaseEntity<UID>, UID extends Serializable>{

    E find(UID uid);
    E find(UID uid, boolean lock);
    List<E> findAll();

    E saveOrUpdate(E entity);
    E merge(E detachedInstance);

    void delete(E entity);
    void deleteById(UID uid);
    void lock(E entity);
}
