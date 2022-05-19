import Enteti.Passengers;
import dao.PassengersHelper;

public class Main {

        public static void main(String[] args) {

            PassengersHelper ph = new PassengersHelper();

            Passengers passengers = new Passengers("Вася", "wq123451", 32, 4325667, 4321122);

            ph.addPassengers(passengers);

        }
    }

