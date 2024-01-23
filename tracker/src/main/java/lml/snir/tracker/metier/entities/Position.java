package lml.snir.tracker.metier.entities;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Matéo
 */

public class Position implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String pos_map;

    public Position() {
    }

    public Position(String pos_map) {
        this.pos_map = pos_map;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long Id) {
        this.id = Id;
    }

//    public void convert(Object aString_pos_map) {
//        throw new UnsupportedOperationException();
//    }

    public String getPos_map() {
        return this.pos_map;
    }

    public void setPos_map(String Pos_map) {
        this.pos_map = Pos_map;
    }

    @Override
    public String toString() {
        return "(" + this.pos_map + ") ";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        return (this.hashCode() == obj.hashCode());
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (this.getId() ^ (this.getId() >>> 32));
        return hash;
    }
}
