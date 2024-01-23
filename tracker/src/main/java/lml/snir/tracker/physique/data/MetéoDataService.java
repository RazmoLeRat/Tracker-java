/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lml.snir.tracker.physique.data;

import lml.snir.persistence.CrudService;
import lml.snir.tracker.metier.entities.Metéo;

/**
 *
 * @author Matéo
 */
public interface MetéoDataService extends CrudService<Metéo> {
    public Metéo getByDate(String date) throws Exception;
    public Metéo getByHeure(String heure) throws Exception;
    public Metéo getByCondition(String condition) throws Exception;
    public Metéo getByVit_vent(int vit_vent) throws Exception;
}
