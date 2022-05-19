package Enteti;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Routes {
    @Id
    private int RoutesId;
    private String Departures;
    private String Arrival;
    private int Time;
    private String AirlineRoutes;



    public int getRoutesId() { return RoutesId; }

    public void setRoutesId(int routesId){ RoutesId = routesId; }

    public String getAirlineRoutes() {return AirlineRoutes;}

    public void setAirlineRoutes(String airlineRoutes) {
        AirlineRoutes = airlineRoutes;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int time) { Time = time; }

    public String getArrival() { return Arrival ;}

    public void setArrival(String arrival) {
        Arrival = arrival;
    }

    public String getDepartures() {
        return Departures;
    }

    public void setDepartures(String departures) {
        Departures = departures;
    }
}
