/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lml.snir.tracker.test;

import lml.snir.tracker.metier.entities.Meteo;
import lml.snir.tracker.metier.entities.Orientation;
import lml.snir.tracker.physique.data.OrientationDataService;
import lml.snir.tracker.metier.entities.Position;
import lml.snir.tracker.physique.data.PositionDataService;
import lml.snir.tracker.metier.entities.Tracker;
import lml.snir.tracker.physique.data.PhysiqueDataFactory;
import lml.snir.tracker.physique.data.TrackerDataService;
import lml.snir.tracker.physique.data.TrackerDataServiceJPAImpl;
import lml.snir.tracker.physique.data.MeteoDataService;


/**
 *
 * @author Matéo
 */
public class TestConsole {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        TestConsole r = new TestConsole();
        try {
            r.test();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void test() throws Exception {
//        new AnimeDataServiceJPAImpl("lml.snir.helloJsf_gestionAnime_war_1.0PU");
//        new UtilisateurDataServiceJPAImpl("lml.snir.helloJsf_gestionAnime_war_1.0PU");
//        new VisionnageDataServiceJPAImpl("lml.snir.helloJsf_gestionAnime_war_1.0PU");
        
       Meteo pluie = new Meteo();
       pluie.setConditionc("Pluie");
       pluie.setDatej("15-12-2024");
       pluie.setHeure("14h20");
       pluie.setVit_vent(12);
       
       Meteo vent = new Meteo();
       pluie.setConditionc("Vent");
       pluie.setDatej("16-01-2024");
       pluie.setHeure("18h20");
       pluie.setVit_vent(24);
       
       Meteo m = new Meteo("Canicule", "18-05-2022", "12h00", 4);
       
       Orientation or = new Orientation(90,360,"15-12-2024", "14h20");
       
       Position p = new Position("49°01'19.9\"N 1°10'09.4\"E");


       MeteoDataService mdsj = PhysiqueDataFactory.getMeteoDataService();
        OrientationDataService odsj = PhysiqueDataFactory.getOrientationDataService();
        PositionDataService pdsj = PhysiqueDataFactory.getPositionDataService();
        
        odsj.add(or);
       mdsj.add(pluie);        
       mdsj.add(vent);
        mdsj.add(m);
        
        pdsj.add(p);
        
        mdsj.getAll();
        odsj.getAll();
        pdsj.getAll();

    } 
    
}
