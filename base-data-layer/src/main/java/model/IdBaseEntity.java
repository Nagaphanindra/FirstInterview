package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@MappedSuperclass
public abstract class IdBaseEntity<ID extends Serializable>  implements BaseEntity<ID>{
    private static long serialVersionUID =1L;

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Access(AccessType.PROPERTY)
    private String id;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public int hashCode(){
        if(getId()==null)
        {
            return nullHashCodeID();
        }
        return getId().hashCode();
    }

    protected int  nullHashCodeID(){return 0;}

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IdBaseEntity<?> other = (IdBaseEntity<?>) obj;
        if (getId() == null) {
            return nullIdEquals(other);
        } else if (!getId().equals(other.getId()))
            return false;
        return true;
    }

    protected boolean nullIdEquals(IdBaseEntity<?> other) {
        return false;
    }

}
