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
@Table(name = "Meteo")

public class Meteo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String datej;
    private String heure;
    private String conditionc;
    private int vit_vent;

    public Meteo() {
    }

    public Meteo(String datej, String heure, String conditionc, int vit_vent) {
        this.conditionc = conditionc;
        this.datej = datej;
        this.heure = heure;
        this.vit_vent = vit_vent;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long Id) {
        this.id = Id;
    }

    public String getDatej() {
        return this.datej;
    }

    public void setDatej(String Datej) {
        this.datej = Datej;
    }

    public String getHeure() {
        return this.heure;
    }

    public void setHeure(String Heure) {
        this.heure = Heure;
    }

    public String getConditionc() {
        return this.conditionc;
    }

    public void setConditionc(String Conditionc) {
        this.conditionc = Conditionc;
    }

    public int getVit_vent() {
        return this.vit_vent;
    }

    public void setVit_vent(int Vit_vent) {
        this.vit_vent = Vit_vent;
    }

    @Override
    public String toString() {
        return "(" + this.conditionc + ") ";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Meteo)) {
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
