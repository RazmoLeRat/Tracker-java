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
import lml.snir.tracker.metier.entities.Tracker;
import lml.snir.tracker.physique.data.TrackerDataService;
import lml.snir.tracker.physique.data.PhysiqueDataFactory;

public class TrackerServiceImpl implements TrackerService {
    
    private final TrackerDataService trackerSrv;

    public TrackerServiceImpl() throws Exception {
        trackerSrv = PhysiqueDataFactory.getTrackerDataService();
    }

    @Override
    public Tracker add(Tracker tracker) throws Exception {
        try {
            return this.trackerSrv.add(tracker);
        } catch (Exception ex) {
            String st = ex.getMessage();
            if (st.contains("SQL : 19")) {
                throw new Exception("Tracker déjà enregistré");
            } else {
                throw ex;
            }
        }
    }

    @Override
    public void remove(Tracker tracker) throws Exception {
        this.trackerSrv.remove(tracker);
    }

    @Override
    public void update(Tracker tracker) throws Exception {
        this.trackerSrv.update(tracker);
    }

    @Override
    public List<Tracker> getAll(int debut, int count) throws Exception {
        return this.trackerSrv.getAll(debut, count);
    }

    @Override
    public Tracker getById(Long id) throws Exception {
        return this.trackerSrv.getById(id);
    }

    @Override
    public long getCount() throws Exception {
        return this.trackerSrv.getCount();
    }

    @Override
    public List<Tracker> getAll() throws Exception {
        return this.trackerSrv.getAll();
    }
}
