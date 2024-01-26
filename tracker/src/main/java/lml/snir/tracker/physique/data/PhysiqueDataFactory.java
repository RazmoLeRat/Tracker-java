/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lml.snir.tracker.physique.data;

/**
 *
 * @author Matéo
 */
public class PhysiqueDataFactory {
    
    private final static String PU = "trackerPU";

    private PhysiqueDataFactory() {
    }

    private static MetéoDataService metéoDataService = null;
    public static MetéoDataService getMetéoDataService() throws Exception {
        if (metéoDataService == null) {
            metéoDataService = new MetéoDataServiceJPAImpl(PU);
        }
        return metéoDataService;
    }
    
        private static OrientationDataService orientationDataService = null;
    public static OrientationDataService getOrientationDataService() throws Exception {
        if (orientationDataService == null) {
            orientationDataService = new OrientationDataServiceJPAImpl(PU);
        }
        return orientationDataService;
    }
    
            private static PositionDataService positionDataService = null;
    public static PositionDataService getPositionDataService() throws Exception {
        if (positionDataService == null) {
            positionDataService = new PositionDataServiceJPAImpl(PU);
        }
        return positionDataService;
    }
    
                private static TrackerDataService trackerDataService = null;
    public static TrackerDataService getTrackerDataService() throws Exception {
        if (trackerDataService == null) {
            trackerDataService = new TrackerDataServiceJPAImpl(PU);
        }
        return trackerDataService;
    }
 }