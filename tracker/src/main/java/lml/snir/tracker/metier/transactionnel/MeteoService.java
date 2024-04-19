/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lml.snir.tracker.metier.transactionnel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import lml.snir.tracker.metier.entities.Meteo;
import lml.snir.persistence.CrudService;

/**
 *
 * @author Matéo
 */
public interface MeteoService extends CrudService<Meteo> {
    public Meteo getByDatej(String datej) throws Exception;
    public Meteo getByHeure(String heure) throws Exception;
    public Meteo getByConditionc(String conditionc) throws Exception;
    public Meteo getByVit_vent(int vit_vent) throws Exception;
}
