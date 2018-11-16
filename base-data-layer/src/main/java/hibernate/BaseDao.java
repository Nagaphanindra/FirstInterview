package hibernate;

import model.BaseDal;
import model.BaseEntity;
import org.hibernate.LockOptions;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;


public class BaseDao <T extends BaseEntity<UID>, UID extends Serializable> implements BaseDal<T, UID> {



    private SessionFactory sessionFactory;

    @PersistenceContext
    private EntityManager entityManager;

    private Class<T> persistentClass;


    protected Session session() {
        return sessionFactory.getCurrentSession();
    }

    protected EntityManager entityManager(){
        return this.entityManager;
    }
    public BaseDao() {
        this.persistentClass = (Class<T>) ((ParameterizedType) getClass().
                getGenericSuperclass()).getActualTypeArguments()[0];
    }

    protected Class<T> persistentClass() {
        return persistentClass;
    }

    @Override
    public T find(UID uid) {
        return entityManager().find(this.persistentClass,uid);

    }

    @Override
    public T find(UID uid, boolean lock) {
        if (lock)
            return (T) session().get(persistentClass(), uid, LockOptions.UPGRADE);
        else
            return (T) session().get(persistentClass(), uid);
    }

    @Override
    public List<T> findAll() {
        CriteriaBuilder criteriaBuilder = entityManager().getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = criteriaBuilder.createQuery(this.persistentClass);
        Root<T> from = criteriaQuery.from(this.persistentClass);
        criteriaQuery.select(from);
        return entityManager().createQuery(criteriaQuery).getResultList();
    }

    @Override
    public T saveOrUpdate(T entity) {
        entityManager().persist(entity);
        return entity;
    }

    @Override
    public T merge(T detachedInstance) {
        entityManager().merge(detachedInstance);
        return detachedInstance;
    }

    @Override
    public void delete(T entity) {
        entityManager().remove(entity);
    }

    @Override
    public void deleteById(UID uid) {
        T entity = (T) session().get(persistentClass(), uid);
        if (entity != null) {
            session().delete(entity);
        }
    }

    @Override
    public void lock(T entity) {
        session().buildLockRequest(LockOptions.UPGRADE).lock(entity);
    }

}
