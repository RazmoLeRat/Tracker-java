/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lml.snir.tracker.physique.data;

import lml.snir.persistence.jpa.AbstracCrudServiceJPA;
import lml.snir.tracker.metier.entities.Tracker;

/**
 *
 * @author jupiter
 */
public class TrackerDataServiceJPAImpl extends AbstracCrudServiceJPA<Tracker> implements TrackerDataService{
    
            public TrackerDataServiceJPAImpl(String PU) {
        super(PU);
    }
    
}
