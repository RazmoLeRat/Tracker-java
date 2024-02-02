/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lml.snir.tracker.physique.data;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import lml.snir.persistence.jpa.AbstracCrudServiceJPA;
import lml.snir.tracker.metier.entities.Position;

/**
 *
 * @author Matéo
 */
public class PositionDataServiceJPAImpl extends AbstracCrudServiceJPA<Position> implements PositionDataService {
    
        public PositionDataServiceJPAImpl(String PU) {
        super(PU);
    }

    @Override
    public Position getByPos_map(String pos_map) throws Exception {
        Position position = null;
        try {
            this.open();
            Query query = em.createQuery("SELECT p FROM Position p WHERE p.pos_map = :fpos_map");
            query.setParameter("fpos_map", position);
            position = (Position) query.getSingleResult();
        } catch (NoResultException ex) {
            return null;
        } finally {
            this.close();
        }
        return position;
    }
    
}
