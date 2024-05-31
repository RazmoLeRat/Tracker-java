package lml.snir.tracker.metier.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Matéo
 */

@Entity
@Table(name = "Orientation")

public class Orientation implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int elevation;
    private int angleSolaire;
    private String date;
    private String heure;
    @Transient
    private final int nb_journee = 48;

    public Orientation() {
    }

    public Orientation(int elevation, int angleSolaire, String date, String heure) {
        this.date = date;
        this.heure = heure;
        this.elevation = elevation;
//        this.nb_journee = nb_journee;
        this.angleSolaire = angleSolaire;
    }
    

    
    public long getId() {
        return this.id;
    }

    public void setId(long Id) {
        this.id = Id;
    }

    public int getElevation() {
        return this.elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public int getAngleSolaire() {
        return this.angleSolaire;
    }

    public void setAngleSolaire(int angleSolaire) {
        this.angleSolaire = angleSolaire;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String Date) {
        this.date = Date;
    }

    public String getHeure() {
        return this.heure;
    }

    public void setHeure(String Heure) {
        this.heure = Heure;
    }

//    public int getNb_journee() {
//        return this.nb_journee;
//    }
//
//    public void setNb_journee(int Nb_journee) {
//        this.nb_journee = Nb_journee;
//    }
    
    @Override
    public String toString() {
        return "(" + this.angleSolaire + ") ";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Orientation)) {
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
