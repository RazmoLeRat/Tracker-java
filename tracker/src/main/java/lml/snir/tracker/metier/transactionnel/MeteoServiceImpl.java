/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lml.snir.tracker.metier.transactionnel;

/**
 *
 * @author Matéo
 */

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import lml.snir.tracker.metier.entities.Meteo;
import lml.snir.tracker.physique.data.MeteoDataService;
import lml.snir.tracker.physique.data.PhysiqueDataFactory;

public class MeteoServiceImpl implements MeteoService {
    
    private final MeteoDataService meteoSrv;

    public MeteoServiceImpl() throws Exception {
        meteoSrv = PhysiqueDataFactory.getMeteoDataService();
    }

    @Override
    public Meteo add(Meteo meteo) throws Exception {
        try {
            return this.meteoSrv.add(meteo);
        } catch (Exception ex) {
            String st = ex.getMessage();
            if (st.contains("SQL : 19")) {
                throw new Exception("Condition metéo déjà enregistré");
            } else {
                throw ex;
            }
        }
    }

    @Override
    public void remove(Meteo meteo) throws Exception {
        this.meteoSrv.remove(meteo);
    }

    @Override
    public void update(Meteo meteo) throws Exception {
        this.meteoSrv.update(meteo);
    }

    @Override
    public List<Meteo> getAll(int debut, int count) throws Exception {
        return this.meteoSrv.getAll(debut, count);
    }

    @Override
    public Meteo getById(Long id) throws Exception {
        return this.meteoSrv.getById(id);
    }

    @Override
    public long getCount() throws Exception {
        return this.meteoSrv.getCount();
    }

    @Override
    public List<Meteo> getAll() throws Exception {
        return this.meteoSrv.getAll();
    }

    @Override
    public Meteo getByDatej(String datej) throws Exception {
        return this.meteoSrv.getByDatej(datej);
    }

    @Override
    public Meteo getByHeure(String heure) throws Exception {
        return this.meteoSrv.getByHeure(heure);
    }

    @Override
    public Meteo getByConditionc(String conditionc) throws Exception {
        return this.meteoSrv.getByConditionc(conditionc);
    }

    @Override
    public Meteo getByVit_vent(int vit_vent) throws Exception {
        return this.meteoSrv.getByVit_vent(vit_vent);
    }
}
