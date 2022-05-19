package Enteti;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tiskit {
    @Id
    private int TiskitId;
    private int Place;
    private String Flight;
    private String Passengers;

    public int getTiskitId() {return TiskitId;}

    public void setTiskitId(int tiskitId) { TiskitId = tiskitId;}

    public int getPlace() {
        return Place;
    }

    public void setPlace(int place) {
        Place = place;
    }

    public String getFlight() {
        return Flight;
    }

    public void setFlight(String flight) {
        Flight = flight;
    }

    public String getPassengers() {
        return Passengers;
    }

    public void setPassengers(String passengers) {
        Passengers = passengers;
    }
}
