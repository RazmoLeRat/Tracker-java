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
import lml.snir.controleacces.metier.entity.Badge;
import lml.snir.controleacces.physique.data.BadgeDataService;
import lml.snir.controleacces.physique.data.PhysiqueDataFactory;

public class BadgeServiceImpl implements BadgeService {
    
    private final BadgeDataService badgeSrv;

    public BadgeServiceImpl() throws Exception {
        badgeSrv = PhysiqueDataFactory.getBadgeDataService();
    }

    @Override
    public Badge add(Badge badge) throws Exception {
        try {
            return this.badgeSrv.add(badge);
        } catch (Exception ex) {
            String st = ex.getMessage();
            if (st.contains("SQL : 19")) {
                throw new Exception("Badge déjà enregistré");
            } else {
                throw ex;
            }
        }
    }

    @Override
    public void remove(Badge badge) throws Exception {
        this.badgeSrv.remove(badge);
    }

    @Override
    public void update(Badge badge) throws Exception {
        this.badgeSrv.update(badge);
    }

    @Override
    public List<Badge> getAll(int debut, int count) throws Exception {
        return this.badgeSrv.getAll(debut, count);
    }

    @Override
    public Badge getByContenu(String contenu) throws Exception {
        return this.badgeSrv.getByContenu(contenu);
    }

    @Override
    public Badge getById(Long id) throws Exception {
        return this.badgeSrv.getById(id);
    }

    @Override
    public long getCount() throws Exception {
        return this.badgeSrv.getCount();
    }

    @Override
    public List<Badge> getAll() throws Exception {
        return this.badgeSrv.getAll();
    }
}
