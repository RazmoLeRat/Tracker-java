package lml.snir.tracker.metier;

import lml.snir.tracker.metier.transactionnel.MetéoService;
import lml.snir.tracker.metier.transactionnel.MetéoServiceImpl;
import lml.snir.tracker.metier.transactionnel.OrientationService;
import lml.snir.tracker.metier.transactionnel.OrientationServiceImpl;
import lml.snir.tracker.metier.transactionnel.PositionService;
import lml.snir.tracker.metier.transactionnel.PositionServiceImpl;
import lml.snir.tracker.metier.transactionnel.TrackerService;
import lml.snir.tracker.metier.transactionnel.TrackerServiceImpl;

/**
 *
 * @author Matéo
 */

public class MetierFactory {  

    private static MetéoService metéoService;    
    public static MetéoService getMetéoService() throws Exception {  
        if (metéoService == null) {
            metéoService = new MetéoServiceImpl();
        }
        return metéoService;
    }
    
    private static OrientationService orientationService;    
    public static OrientationService getOrientationService() throws Exception {  
        if (orientationService == null) {
            orientationService = new OrientationServiceImpl();
        }
        return orientationService;
    }
    
    private static PositionService positionService;    
    public static PositionService getPositionService() throws Exception {  
        if (positionService == null) {
            positionService = new PositionServiceImpl();
        }
        return positionService;
    }
    
    private static TrackerService trackerService;    
    public static TrackerService getTrackerService() throws Exception {  
        if (trackerService == null) {
            trackerService = new TrackerServiceImpl();
        }
        return trackerService;
    }
}