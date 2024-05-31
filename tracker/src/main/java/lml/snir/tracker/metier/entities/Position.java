package lml.snir.tracker.metier.entities;

import java.io.Serializable;
import java.util.Objects;
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
@Table(name = "Position")
public class Position implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String pos_map = "45.77680266269328, 4.877144493873817";

    private double latitude;
    private double longitude;

    public Position() {
    }


    /**
     * 
     * @param pos_map 
     * D'abord entrée la latitude puis la longitude séparé par une virgule et un espace
     * exemple "45.77, 4.87"
     */
    public Position(String pos_map) {
        String[] pos = pos_map.split(" ");
        String str = pos[0];

        if (str != null && str.length() > 0 && str.charAt(str.length() - 1) == ',') {
            str = str.substring(0, str.length() - 1);
        }

        pos[0] = str;

        latitude = Double.parseDouble(pos[0]);
        longitude = Double.parseDouble(pos[1]);

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

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (int) (this.id ^ (this.id >>> 32));
        hash = 73 * hash + Objects.hashCode(this.pos_map);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.latitude) ^ (Double.doubleToLongBits(this.latitude) >>> 32));
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.longitude) ^ (Double.doubleToLongBits(this.longitude) >>> 32));
        return hash;
    }
    
}
