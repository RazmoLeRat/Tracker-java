/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lml.snir.tracker.physique.data;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import lml.snir.persistence.jpa.AbstracCrudServiceJPA;
import lml.snir.tracker.metier.entities.Orientation;

/**
 *
 * @author Matéo
 */
public class OrientationDataServiceJPAImpl extends AbstracCrudServiceJPA<Orientation> implements OrientationDataService  {
    
    public OrientationDataServiceJPAImpl(String PU) {
        super(PU);
    }

    @Override
    public Orientation getByInclinaison(int inclinaison) throws Exception {
        Orientation orientation = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT o FROM Orientation o WHERE o.inclinaison = :finclinaison");
            query.setParameter("finclinaison", orientation);
            orientation = (Orientation) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return orientation;
    }

    @Override
    public Orientation getByHeure(String heure) throws Exception {
        Orientation orientation = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT o FROM Orientation o WHERE o.heure = :fheure");
            query.setParameter("fheure", orientation);
            orientation = (Orientation) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return orientation;
    }

    @Override
    public Orientation getByDate(String date) throws Exception {
        Orientation orientation = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT o FROM Orientation o WHERE o.date = :fdate");
            query.setParameter("fdate", orientation);
            orientation = (Orientation) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return orientation;
    }

    @Override
    public Orientation getByOrien(int orien) throws Exception {
        Orientation orientation = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT o FROM Orientation o WHERE o.orien = :forien");
            query.setParameter("forien", orientation);
            orientation = (Orientation) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return orientation;
    }

    @Override
    public Orientation getByNb_journee(int nb_journee) throws Exception {
        Orientation orientation = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT o FROM Orientation o WHERE o.nb_journee = :fnb_journee");
            query.setParameter("fnb_journee", orientation);
            orientation = (Orientation) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return orientation;
    }
    
}
