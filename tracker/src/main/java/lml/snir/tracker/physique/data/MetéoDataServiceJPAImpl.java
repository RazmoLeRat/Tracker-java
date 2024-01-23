/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lml.snir.tracker.physique.data;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import lml.snir.persistence.jpa.AbstracCrudServiceJPA;
import lml.snir.tracker.metier.entities.Metéo;

/**
 *
 * @author Matéo
 */
public class MetéoDataServiceJPAImpl extends AbstracCrudServiceJPA<Metéo> implements MetéoDataService {

    public MetéoDataServiceJPAImpl(String PU) {
        super(PU);
    }

    @Override
    public Metéo getByDate(String date) throws Exception {
        Metéo metéo = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT m FROM Metéo m WHERE m.date = :fdate");
            query.setParameter("fdate", metéo);
            metéo = (Metéo) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return metéo;
    }

    @Override
    public Metéo getByHeure(String heure) throws Exception {
        Metéo metéo = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT m FROM Metéo m WHERE m.heure = :fheure");
            query.setParameter("fheure", metéo);
            metéo = (Metéo) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return metéo;
    }

    @Override
    public Metéo getByCondition(String condition) throws Exception {
        Metéo metéo = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT m FROM Metéo m WHERE m.condition = :fcondition");
            query.setParameter("fcondition", metéo);
            metéo = (Metéo) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return metéo;
    }

    @Override
    public Metéo getByVit_vent(int vit_vent) throws Exception {
        Metéo metéo = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT m FROM Metéo m WHERE m.vit_vent = :fvit_vent");
            query.setParameter("fvit_vent", metéo);
            metéo = (Metéo) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return metéo;
    }

}
