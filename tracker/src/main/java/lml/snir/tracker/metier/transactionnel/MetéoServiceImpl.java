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

import java.util.List;
import lml.snir.tracker.metier.entities.Metéo;
import lml.snir.tracker.physique.data.MetéoDataService;
import lml.snir.tracker.physique.data.PhysiqueDataFactory;

public class MetéoServiceImpl implements MetéoService {
    
    private final MetéoDataService metéoSrv;

    public MetéoServiceImpl() throws Exception {
        metéoSrv = PhysiqueDataFactory.getMetéoDataService();
    }

    @Override
    public Metéo add(Metéo metéo) throws Exception {
        try {
            return this.metéoSrv.add(metéo);
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
    public void remove(Metéo metéo) throws Exception {
        this.metéoSrv.remove(metéo);
    }

    @Override
    public void update(Metéo metéo) throws Exception {
        this.metéoSrv.update(metéo);
    }

    @Override
    public List<Metéo> getAll(int debut, int count) throws Exception {
        return this.metéoSrv.getAll(debut, count);
    }

    @Override
    public Metéo getById(Long id) throws Exception {
        return this.metéoSrv.getById(id);
    }

    @Override
    public long getCount() throws Exception {
        return this.metéoSrv.getCount();
    }

    @Override
    public List<Metéo> getAll() throws Exception {
        return this.metéoSrv.getAll();
    }

    @Override
    public Metéo getByDate(String date) throws Exception {
        return this.metéoSrv.getByDate(date);
    }

    @Override
    public Metéo getByHeure(String heure) throws Exception {
        return this.metéoSrv.getByHeure(heure);
    }

    @Override
    public Metéo getByCondition(String condition) throws Exception {
        return this.metéoSrv.getByCondition(condition);
    }

    @Override
    public Metéo getByVit_vent(int vit_vent) throws Exception {
        return this.metéoSrv.getByVit_vent(vit_vent);
    }
}
