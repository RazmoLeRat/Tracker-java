package lml.snir.tracker.metier.entities;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Transient;

/**
 *
 * @author Matéo
 */
@Entity
@Table(name = "Meteo")
@XmlRootElement
public class Meteo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String datej;
    private String heure;
    private String conditionc;
    private int vit_vent;

    @Transient
    SimpleDateFormat days = new SimpleDateFormat("dd-MM-yyyy");
    @Transient
    SimpleDateFormat hours = new SimpleDateFormat("kk:mm");

    public Meteo() {
    }

    public Meteo(String conditionc, int vit_vent) {

        Date d = new Date();
        
        String today = days.format(d);
        String tdh = hours.format(d);

        this.conditionc = conditionc;
        this.datej = today;
        this.heure = tdh;
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
