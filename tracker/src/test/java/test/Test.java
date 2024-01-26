/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Matéo
 */
import java.util.List;
import lml.snir.tracker.metier.entities.Metéo;
import lml.snir.tracker.metier.entities.Orientation;
import lml.snir.tracker.metier.entities.Position;
import lml.snir.tracker.metier.entities.Tracker;
import lml.snir.tracker.physique.data.MetéoDataService;
import lml.snir.tracker.physique.data.MetéoDataServiceJPAImpl;
import lml.snir.tracker.physique.data.OrientationDataService;
import lml.snir.tracker.physique.data.OrientationDataServiceJPAImpl;
import lml.snir.tracker.physique.data.PositionDataService;
import lml.snir.tracker.physique.data.PositionDataServiceJPAImpl;
import lml.snir.tracker.physique.data.TrackerDataService;
import lml.snir.tracker.physique.data.TrackerDataServiceJPAImpl;


/**
 *
 * @author jupiter
 */
public class Test {
    public static void main(String[] args) throws Exception{
        MetéoDataService mds = new MetéoDataServiceJPAImpl("trackerPU");
        OrientationDataService ods = new OrientationDataServiceJPAImpl("trackerPU");
        PositionDataService pds = new PositionDataServiceJPAImpl("trackerPU");
        TrackerDataService tds = new TrackerDataServiceJPAImpl("trackerPU");
      
        Metéo pluie = new Metéo("HND");
//        Avion boeing777 = new Avion(1,"mr.truc",120);
//        Destination japon = new Destination(1,"Japon");
//        
       haneda = aeds.add(haneda);
//        boeing777 = ads.add(boeing777);
//        japon = dds.add(japon);
        
//        eds.getAll();
//        tds.getAll();
//        ads.getAll();
        List<Aeroport> aeroports = aeds.getAll();
        for (Aeroport a : aeroports) {
            System.out.println(a);
        }
//        dds.getAll();
        
        
    }
}
