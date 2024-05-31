package lml.snir.tracker.metier;

import lml.snir.tracker.metier.transactionnel.MeteoServiceImpl;
import lml.snir.tracker.metier.transactionnel.OrientationService;
import lml.snir.tracker.metier.transactionnel.OrientationServiceImpl;
import lml.snir.tracker.metier.transactionnel.PositionService;
import lml.snir.tracker.metier.transactionnel.PositionServiceImpl;
import lml.snir.tracker.metier.transactionnel.TrackerService;
import lml.snir.tracker.metier.transactionnel.TrackerServiceImpl;
import lml.snir.tracker.metier.transactionnel.MeteoService;

/**
 *
 * @author Matéo
 */
public class MetierFactory {

    private static MeteoService meteoService;

    public static MeteoService getMeteoService() throws Exception {
        if (meteoService == null) {
            meteoService = new MeteoServiceImpl();
        }
        return meteoService;
    }

    private static OrientationService orientationService;

    public static OrientationService getOrientationService() throws Exception {
        if (orientationService == null) {
            orientationService = new OrientationServiceImpl();
        }
        return orientationService;
    }

    private static PositionService positionService = null;

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
