/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lml.snir.tracker.metier.transactionnel;

import lml.snir.persistence.CrudService;
import lml.snir.tracker.metier.entities.Position;

/**
 *
 * @author Matéo
 */
public interface PositionService extends CrudService<Position> {
    public Position getByPos_map(String pos_map) throws Exception;
}
