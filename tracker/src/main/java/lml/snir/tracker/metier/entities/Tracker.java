package lml.snir.tracker.metier.entities;


import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Matéo
 */

@Entity
@Table(name = "Tracker")
public class Tracker implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    public Tracker() {
    }
    
	public long getId() {
        return this.id;
    }

    public void setId(long Id) {
        this.id = Id;
    }
    
    @Override
    public String toString() {
        return "(" + this.id + ") ";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Tracker)) {
            return false;
        }
        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (this.getId() ^ (this.getId() >>>32));
        return hash;
    }
}