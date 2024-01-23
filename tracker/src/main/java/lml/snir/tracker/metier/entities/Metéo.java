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
@Table(name = "Metéo")

public class Metéo implements Serializable {
	
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
        private String date;
	private String heure;
	private String condition;
	private int vit_vent;
        
      public Metéo() {
    }

         public Metéo(String date, String heure, String condition, int vit_vent) {
             this.condition = condition;
             this.date = date;
             this.heure = heure;
             this.vit_vent = vit_vent;
    }
         
         public long getId() {
        return this.id;
    }

    public void setId(long Id) {
        this.id = Id;
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

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String Condition) {
		this.condition = Condition;
	}

	public int getVit_vent() {
		return this.vit_vent;
	}

	public void setVit_vent(int Vit_vent) {
		this.vit_vent = Vit_vent;
	}
        
        @Override
    public String toString() {
        return "(" + this.condition + ") ";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Metéo)) {
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