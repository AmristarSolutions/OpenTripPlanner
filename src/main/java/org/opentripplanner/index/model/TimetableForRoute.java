package org.opentripplanner.index.model;

import java.util.List;


import org.opentripplanner.index.model.TimetableForTrip;
import org.onebusaway.gtfs.model.AgencyAndId;
import org.onebusaway.gtfs.model.Route;

public class TimetableForRoute {

    public AgencyAndId routedId;
    public String routeLongName;
    public String routeShortName;
    public int schoolOnly;
    public int routeType;
    public List<TimetableForTrip> routeTimetable;

    /** This class represent timetable for a route.
     */
    public TimetableForRoute(Route r, List<TimetableForTrip> tt) {
        this.routedId = r.getId();
        routeLongName = r.getLongName();
        routeShortName = r.getShortName();
        schoolOnly = r.getSchoolOnly();
        routeType = r.getType();
        routeTimetable = tt;
    }
}