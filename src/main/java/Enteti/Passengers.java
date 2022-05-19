package Enteti;

import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;

@EqualsAndHashCode
@Entity

public class Passengers {

    public Passengers() {
    }

    public Passengers(String PassengersName, String Passport, int Age , int Phone , int Tiskit){
        this.PassengersName = PassengersName;
        this.Passport = Passport;
        this.Age = Age;
        this.Phone = Phone;
        this.Tiskit = Tiskit;
    }


    @Id

    private int PassengersId;

    private String PassengersName;

    private String Passport;

    private int Age;

    private int Phone;

    private int Tiskit;


    public int getPassengersId() {return PassengersId;}

    public void setPassengersId(int passengersId) {
        PassengersId = passengersId;
    }

    public String getPassengersName() {
        return PassengersName;
    }

    public void setPassengersName(String passengersName) {
        PassengersName = passengersName;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int phone) {
        Phone = phone;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getPassport() {
        return Passport;
    }

    public void setPassport(String passport) {
        Passport = passport;
    }

    public int getTiskit() {
        return Tiskit;
    }

    public void setTiskit(int tiskit) {
        Tiskit = tiskit;
    }
}