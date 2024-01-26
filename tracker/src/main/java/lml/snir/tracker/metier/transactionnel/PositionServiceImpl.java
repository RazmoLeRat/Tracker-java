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
import lml.snir.tracker.metier.entities.Position;
import lml.snir.tracker.physique.data.PositionDataService;
import lml.snir.tracker.physique.data.PhysiqueDataFactory;

public class PositionServiceImpl implements PositionService {
    
    private final PositionDataService positionSrv;

    public PositionServiceImpl() throws Exception {
        positionSrv = PhysiqueDataFactory.getPositionDataService();
    }

    @Override
    public Position add(Position position) throws Exception {
        try {
            return this.positionSrv.add(position);
        } catch (Exception ex) {
            String st = ex.getMessage();
            if (st.contains("SQL : 19")) {
                throw new Exception("Position déjà enregistré");
            } else {
                throw ex;
            }
        }
    }

    @Override
    public void remove(Position position) throws Exception {
        this.positionSrv.remove(position);
    }

    @Override
    public void update(Position position) throws Exception {
        this.positionSrv.update(position);
    }

    @Override
    public List<Position> getAll(int debut, int count) throws Exception {
        return this.positionSrv.getAll(debut, count);
    }

    @Override
    public Position getById(Long id) throws Exception {
        return this.positionSrv.getById(id);
    }

    @Override
    public long getCount() throws Exception {
        return this.positionSrv.getCount();
    }

    @Override
    public List<Position> getAll() throws Exception {
        return this.positionSrv.getAll();
    }

    @Override
    public Position getByPos_map(String pos_map) throws Exception {
        return this.positionSrv.getByPos_map(pos_map);
    }

}
