/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lml.snir.tracker.physique.data;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import lml.snir.persistence.jpa.AbstracCrudServiceJPA;
import lml.snir.tracker.metier.entities.Meteo;

/**
 *
 * @author Matéo
 */
public class MeteoDataServiceJPAImpl extends AbstracCrudServiceJPA<Meteo> implements MeteoDataService {

    public MeteoDataServiceJPAImpl(String PU) {
        super(PU);
    }

    @Override
    public Meteo getByDatej(String datej) throws Exception {
        Meteo meteo = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT m FROM Meteo m WHERE m.datej = :fdate");
            query.setParameter("fdate", meteo);
            meteo = (Meteo) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return meteo;
    }

    @Override
    public Meteo getByHeure(String heure) throws Exception {
        Meteo meteo = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT m FROM Meteo m WHERE m.heure = :fheure");
            query.setParameter("fheure", meteo);
            meteo = (Meteo) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return meteo;
    }

    @Override
    public Meteo getByConditionc(String conditionc) throws Exception {
        Meteo meteo = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT m FROM Meteo m WHERE m.conditionc = :fcondition");
            query.setParameter("fcondition", meteo);
            meteo = (Meteo) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return meteo;
    }

    @Override
    public Meteo getByVit_vent(int vit_vent) throws Exception {
        Meteo meteo = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT m FROM Meteo m WHERE m.vit_vent = :fvit_vent");
            query.setParameter("fvit_vent", meteo);
            meteo = (Meteo) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return meteo;
    }

}
