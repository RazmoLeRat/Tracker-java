/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lml.snir.tracker.physique.data;

import lml.snir.persistence.CrudService;
import lml.snir.tracker.metier.entities.Orientation;

/**
 *
 * @author Matéo
 */
public interface OrientationDataService extends CrudService<Orientation> {
    public Orientation getByInclinaison(int inclinaison) throws Exception;
    public Orientation getByHeure(String heure) throws Exception;
    public Orientation getByDate(String date) throws Exception;
    public Orientation getByOrien(int orien) throws Exception;
    public Orientation getByNb_journee(int nb_journee) throws Exception;
}