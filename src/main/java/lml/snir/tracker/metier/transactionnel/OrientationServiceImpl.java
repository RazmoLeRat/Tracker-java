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
import lml.snir.tracker.metier.entities.Orientation;
import lml.snir.tracker.physique.data.OrientationDataService;
import lml.snir.tracker.physique.data.PhysiqueDataFactory;

public class OrientationServiceImpl implements OrientationService {
    
    private final OrientationDataService orientationSrv;

    public OrientationServiceImpl() throws Exception {
        orientationSrv = PhysiqueDataFactory.getOrientationDataService();
    }

    @Override
    public Orientation add(Orientation orientation) throws Exception {
        try {
            return this.orientationSrv.add(orientation);
        } catch (Exception ex) {
            String st = ex.getMessage();
            if (st.contains("SQL : 19")) {
                throw new Exception("Orientation déjà enregistré");
            } else {
                throw ex;
            }
        }
    }

    @Override
    public void remove(Orientation orientation) throws Exception {
        this.orientationSrv.remove(orientation);
    }

    @Override
    public void update(Orientation orientation) throws Exception {
        this.orientationSrv.update(orientation);
    }

    @Override
    public List<Orientation> getAll(int debut, int count) throws Exception {
        return this.orientationSrv.getAll(debut, count);
    }

    @Override
    public Orientation getById(Long id) throws Exception {
        return this.orientationSrv.getById(id);
    }

    @Override
    public long getCount() throws Exception {
        return this.orientationSrv.getCount();
    }

    @Override
    public List<Orientation> getAll() throws Exception {
        return this.orientationSrv.getAll();
    }

    @Override
    public Orientation getByInclinaison(int inclinaison) throws Exception {
        return this.orientationSrv.getByInclinaison(inclinaison);
    }

    @Override
    public Orientation getByHeure(String heure) throws Exception {
        return this.orientationSrv.getByHeure(heure);
    }

    @Override
    public Orientation getByDate(String date) throws Exception {
        return this.orientationSrv.getByDate(date);
    }

    @Override
    public Orientation getByOrien(int orien) throws Exception {
        return this.orientationSrv.getByOrien(orien);
    }

    @Override
    public Orientation getByNb_journee(int nb_journee) throws Exception {
        return this.orientationSrv.getByNb_journee(nb_journee);
    }

}
