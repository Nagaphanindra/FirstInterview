package model;

import java.io.Serializable;

public interface BaseEntity<UID extends Serializable> extends Serializable {

    int hashCode();
    boolean equals(Object obj);
}
